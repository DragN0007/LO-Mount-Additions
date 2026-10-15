package com.dragn0007.dragnloequestrian.items;

import com.dragn0007.dragnloequestrian.MountAdditions;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.Map;

public class MAItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MountAdditions.MODID);
    public static final Map<DyeColor, RegistryObject<Item>> DYED_ITEMS = new EnumMap<>(DyeColor.class);



    //Mod Item Tab Icon (UNOBTAINABLE)
    public static final RegistryObject<Item> MOUNT_ADDITIONS_LOGO = ITEMS.register("mount_additions_logo",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}