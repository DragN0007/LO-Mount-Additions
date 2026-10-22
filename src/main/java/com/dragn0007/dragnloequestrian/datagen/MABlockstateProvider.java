package com.dragn0007.dragnloequestrian.datagen;

import com.dragn0007.dragnloequestrian.MountAdditions;
import com.dragn0007.dragnloequestrian.blocks.MABlocks;
import com.dragn0007.dragnloequestrian.blocks.decor.TackTrunkBlock;
import com.dragn0007.dragnloequestrian.util.WoodColors;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
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
        for (WoodColors color : WoodColors.values()) {
            RegistryObject<TackTrunkBlock> blockRegistryObject = MABlocks.WOODEN_TACK_TRUNK.get(color);
            TackTrunkBlock block = blockRegistryObject.get();
            customBlock(block, color.toString().toLowerCase() + "_tack_trunk", "tack_trunk");
        }

        for (DyeColor color : DyeColor.values()) {
            RegistryObject<TackTrunkBlock> blockRegistryObject = MABlocks.DYED_TACK_TRUNK.get(color);
            TackTrunkBlock block = blockRegistryObject.get();
            customBlock(block, color.toString().toLowerCase() + "_tack_trunk", "tack_trunk");
        }
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(MountAdditions.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void customBlock(Block block, String getTextureName, String modelPath) {
        ResourceLocation texture = modLoc("block/" + getTextureName);
        String blockPath = block.builtInRegistryHolder().key().location().getPath();
        ModelFile model = models().withExistingParent(blockPath, modLoc("block/parent/" + modelPath))
                .texture("particle", texture)
                .texture("texture", texture)
                .renderType("cutout");
        getVariantBuilder(block).forAllStatesExcept(state -> {
            ModelFile modelFile = model;
            return ConfiguredModel.builder()
                    .modelFile(modelFile)
                    .build();
        });
        simpleBlockItem(block, model);
    }
}
