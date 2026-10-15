package com.dragn0007.dragnloequestrian.datagen.biglooter;

import com.dragn0007.dragnloequestrian.blocks.MABlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MABlockLoot extends BlockLootSubProvider {
    public MABlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {

    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return MABlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
