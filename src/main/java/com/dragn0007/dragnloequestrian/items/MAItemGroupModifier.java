package com.dragn0007.dragnloequestrian.items;

import com.dragn0007.dragnloequestrian.MountAdditions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MAItemGroupModifier {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MountAdditions.MODID);

    public static final RegistryObject<CreativeModeTab> MOUNT_OVERHAUL_GROUP = CREATIVE_MODE_TABS.register("overhauled_mounts",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MAItems.MOUNT_ADDITIONS_LOGO.get())).title(Component.translatable("itemGroup.mounts"))
                    .displayItems((displayParameters, output) -> {

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


