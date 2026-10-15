package com.dragn0007.dragnloequestrian.datagen;

import com.dragn0007.dragnloequestrian.MountAdditions;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MABlockstateProvider extends BlockStateProvider {
    public MABlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MountAdditions.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(MountAdditions.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
