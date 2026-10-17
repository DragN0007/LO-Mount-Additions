package com.dragn0007.dragnloequestrian.datagen.biglooter;

import com.dragn0007.dragnloequestrian.blocks.MABlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MABlockLoot extends BlockLootSubProvider {
    public MABlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        for (DyeColor color : DyeColor.values()) {dropSelf(MABlocks.SINGLE_BAR_JUMPS.get(color).get());}
        for (DyeColor color : DyeColor.values()) {dropSelf(MABlocks.DOUBLE_BAR_JUMPS.get(color).get());}
        for (DyeColor color : DyeColor.values()) {dropSelf(MABlocks.WIDE_BAR_JUMPS.get(color).get());}
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return MABlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
