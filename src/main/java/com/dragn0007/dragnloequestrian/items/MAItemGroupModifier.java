package com.dragn0007.dragnloequestrian.items;

import com.dragn0007.dragnlivestock.items.LOItems;
import com.dragn0007.dragnloequestrian.MountAdditions;
import com.dragn0007.dragnloequestrian.util.DefaultTackColors;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
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
                        for (DefaultTackColors color : DefaultTackColors.values()) {output.accept(MAItems.BITLESS_BRIDLES.get(color).get());}
                        for (DefaultTackColors color : DefaultTackColors.values()) {output.accept(MAItems.BLIND_BRIDLES.get(color).get());}
                        for (DefaultTackColors color : DefaultTackColors.values()) {output.accept(MAItems.DOUBLE_REIN_BRIDLES.get(color).get());}
                        for (DefaultTackColors color : DefaultTackColors.values()) {output.accept(MAItems.HEAVY_BRIDLES.get(color).get());}
                        for (DefaultTackColors color : DefaultTackColors.values()) {output.accept(MAItems.LIGHT_BRIDLES.get(color).get());}
                        for (DefaultTackColors color : DefaultTackColors.values()) {output.accept(MAItems.RACING_BRIDLES.get(color).get());}
                        for (DefaultTackColors color : DefaultTackColors.values()) {output.accept(MAItems.SIMPLE_BRIDLES.get(color).get());}
                        for (DefaultTackColors color : DefaultTackColors.values()) {output.accept(MAItems.WAR_BRIDLES.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.MEDIEVAL_BRIDLES.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.BLACK_MEDIEVAL_BRIDLES.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.WHITE_MEDIEVAL_BRIDLES.get(color).get());}

                        for (DefaultTackColors color : DefaultTackColors.values()) {output.accept(MAItems.RACING_SADDLES.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.MEDIEVAL_SADDLES.get(color).get());}

                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.PATTERNED_BLANKETS.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.BLACK_LINED_DRESSAGE_BLANKETS.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.WHITE_LINED_DRESSAGE_BLANKETS.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.BLACK_LINED_QUARTER_SHEETS.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.WHITE_LINED_QUARTER_SHEETS.get(color).get());}

                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.EAR_HOODS.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.LINED_EAR_HOODS.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.LEG_WRAPS.get(color).get());}
                        for (DyeColor color : DyeColor.values()) {output.accept(MAItems.LINED_LEG_WRAPS.get(color).get());}
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


