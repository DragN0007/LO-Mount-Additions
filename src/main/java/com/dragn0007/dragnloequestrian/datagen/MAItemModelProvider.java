package com.dragn0007.dragnloequestrian.datagen;

import com.dragn0007.dragnloequestrian.MountAdditions;
import com.dragn0007.dragnloequestrian.blocks.MABlocks;
import com.dragn0007.dragnloequestrian.blocks.training.BaseJumpBlock;
import com.dragn0007.dragnloequestrian.blocks.training.DoubleBarJumpBlock;
import com.dragn0007.dragnloequestrian.items.MAItems;
import com.dragn0007.dragnloequestrian.util.DefaultTackColors;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
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

        for (DefaultTackColors color : DefaultTackColors.values()) {simpleItem(MAItems.BITLESS_BRIDLES.get(color));}
        for (DefaultTackColors color : DefaultTackColors.values()) {simpleItem(MAItems.BLIND_BRIDLES.get(color));}
        for (DefaultTackColors color : DefaultTackColors.values()) {simpleItem(MAItems.DOUBLE_REIN_BRIDLES.get(color));}
        for (DefaultTackColors color : DefaultTackColors.values()) {simpleItem(MAItems.HEAVY_BRIDLES.get(color));}
        for (DefaultTackColors color : DefaultTackColors.values()) {simpleItem(MAItems.LIGHT_BRIDLES.get(color));}
        for (DefaultTackColors color : DefaultTackColors.values()) {simpleItem(MAItems.RACING_BRIDLES.get(color));}
        for (DefaultTackColors color : DefaultTackColors.values()) {simpleItem(MAItems.SIMPLE_BRIDLES.get(color));}
        for (DefaultTackColors color : DefaultTackColors.values()) {simpleItem(MAItems.WAR_BRIDLES.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.MEDIEVAL_BRIDLES.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.BLACK_MEDIEVAL_BRIDLES.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.WHITE_MEDIEVAL_BRIDLES.get(color));}

        for (DefaultTackColors color : DefaultTackColors.values()) {simpleItem(MAItems.RACING_SADDLES.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.MEDIEVAL_SADDLES.get(color));}

        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.PATTERNED_BLANKETS.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.BLACK_LINED_DRESSAGE_BLANKETS.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.WHITE_LINED_DRESSAGE_BLANKETS.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.BLACK_LINED_QUARTER_SHEETS.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.WHITE_LINED_QUARTER_SHEETS.get(color));}

        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.EAR_HOODS.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.LINED_EAR_HOODS.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.LEG_WRAPS.get(color));}
        for (DyeColor color : DyeColor.values()) {simpleItem(MAItems.LINED_LEG_WRAPS.get(color));}

        for (DyeColor color : DyeColor.values()) {spriteJumpBlock(MABlocks.SINGLE_BAR_JUMPS.get(color));}
        for (DyeColor color : DyeColor.values()) {spriteDoubleJumpBlock(MABlocks.DOUBLE_BAR_JUMPS.get(color));}
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
    private ItemModelBuilder spriteJumpBlock(RegistryObject<BaseJumpBlock> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MountAdditions.MODID,"item/" + block.getId().getPath()));
    }
    private ItemModelBuilder spriteDoubleJumpBlock(RegistryObject<DoubleBarJumpBlock> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MountAdditions.MODID,"item/" + block.getId().getPath()));
    }
}