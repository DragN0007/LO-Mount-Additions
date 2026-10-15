package com.dragn0007.dragnloequestrian.datagen;

import com.dragn0007.dragnloequestrian.MountAdditions;
import com.dragn0007.dragnloequestrian.items.MAItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class MAItemModelProvider extends ItemModelProvider {
    public MAItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MountAdditions.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {
        simpleItem(MAItems.MOUNT_ADDITIONS_LOGO);
    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MountAdditions.MODID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleSpriteBlock(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MountAdditions.MODID,"block/" + block.getId().getPath()));
    }
}