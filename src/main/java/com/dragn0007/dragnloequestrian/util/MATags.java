package com.dragn0007.dragnloequestrian.util;

import com.dragn0007.dragnloequestrian.MountAdditions;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MATags {

    public static class Items {

        public static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
        public static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(MountAdditions.MODID, name));
        }
    }

    public static class Entity_Types {

        public static TagKey<EntityType<?>> forgeTag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> JUMPS = tag("jumps");

        public static TagKey<Block> forgeTag (String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
        public static TagKey<Block> tag (String name) {
            return BlockTags.create(new ResourceLocation(MountAdditions.MODID, name));
        }
    }

}
