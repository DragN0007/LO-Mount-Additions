package com.dragn0007.dragnloequestrian.blocks;

import com.dragn0007.dragnlivestock.items.LOItems;
import com.dragn0007.dragnloequestrian.MountAdditions;
import com.dragn0007.dragnloequestrian.blocks.training.BaseJumpBlock;
import com.dragn0007.dragnloequestrian.blocks.training.DoubleBarJumpBlock;
import com.dragn0007.dragnloequestrian.blocks.training.WideBarJumpBlock;
import com.dragn0007.dragnloequestrian.items.MAItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.OAK_FENCE;

public class MABlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MountAdditions.MODID);
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MountAdditions.MODID);

    public static final Map<DyeColor, RegistryObject<BaseJumpBlock>> SINGLE_BAR_JUMPS = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, RegistryObject<Item>> SINGLE_BAR_JUMP_ITEMS = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
            String blockName = color.getName() + "_single_bar_jump";
            RegistryObject<BaseJumpBlock> block = BLOCKS.register(blockName,
                    () -> new BaseJumpBlock(BlockBehaviour.Properties.copy(OAK_FENCE).strength(0.1F)));
            RegistryObject<Item> blockItem = MAItems.ITEMS.register(blockName,
                    () -> new BlockItem(block.get(), new Item.Properties()));
            SINGLE_BAR_JUMPS.put(color, block);
            SINGLE_BAR_JUMP_ITEMS.put(color, blockItem);}
    }

    public static final Map<DyeColor, RegistryObject<DoubleBarJumpBlock>> DOUBLE_BAR_JUMPS = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, RegistryObject<Item>> DOUBLE_BAR_JUMP_ITEMS = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
        String blockName = color.getName() + "_double_bar_jump";
        RegistryObject<DoubleBarJumpBlock> block = BLOCKS.register(blockName,
                () -> new DoubleBarJumpBlock(BlockBehaviour.Properties.copy(OAK_FENCE).strength(0.1F)));
        RegistryObject<Item> blockItem = MAItems.ITEMS.register(blockName,
                () -> new BlockItem(block.get(), new Item.Properties()));
        DOUBLE_BAR_JUMPS.put(color, block);
        DOUBLE_BAR_JUMP_ITEMS.put(color, blockItem);}
    }

    public static final Map<DyeColor, RegistryObject<WideBarJumpBlock>> WIDE_BAR_JUMPS = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, RegistryObject<Item>> WIDE_BAR_JUMP_ITEMS = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
        String blockName = color.getName() + "_wide_bar_jump";
        RegistryObject<WideBarJumpBlock> block = BLOCKS.register(blockName,
                () -> new WideBarJumpBlock(BlockBehaviour.Properties.copy(OAK_FENCE).strength(0.1F).noOcclusion()));
        RegistryObject<Item> blockItem = MAItems.ITEMS.register(blockName,
                () -> new BlockItem(block.get(), new Item.Properties()));
        WIDE_BAR_JUMPS.put(color, block);
        WIDE_BAR_JUMP_ITEMS.put(color, blockItem);}
    }

    public static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        LOItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }
    public static <T extends Block>RegistryObject<T> registerWaterBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerWaterBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerWaterBlockItem(String name, RegistryObject<T> block) {
        MAItems.ITEMS.register(name, () -> new PlaceOnWaterBlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
