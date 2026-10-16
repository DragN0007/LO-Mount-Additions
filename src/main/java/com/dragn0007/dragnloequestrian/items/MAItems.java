package com.dragn0007.dragnloequestrian.items;

import com.dragn0007.dragnlivestock.items.custom.BlanketItem;
import com.dragn0007.dragnloequestrian.MountAdditions;
import com.dragn0007.dragnloequestrian.items.custom.BridleItem;
import com.dragn0007.dragnloequestrian.items.custom.FaceCosmeticItem;
import com.dragn0007.dragnloequestrian.items.custom.LegsCosmeticItem;
import com.dragn0007.dragnloequestrian.util.DefaultTackColors;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SaddleItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.Map;

public class MAItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MountAdditions.MODID);
    public static final Map<DyeColor, RegistryObject<Item>> DYED_ITEMS = new EnumMap<>(DyeColor.class);


    //BRIDLES
    public static final Map<DefaultTackColors, RegistryObject<Item>> BITLESS_BRIDLES  = new EnumMap<>(DefaultTackColors.class);
    static {for (DefaultTackColors color : DefaultTackColors.values()) {
            String name = color.getName() + "bitless_bridle";
            RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
            BITLESS_BRIDLES.put(color, item);}
    }
    public static final Map<DefaultTackColors, RegistryObject<Item>> BLIND_BRIDLES  = new EnumMap<>(DefaultTackColors.class);
    static {for (DefaultTackColors color : DefaultTackColors.values()) {
            String name = color.getName() + "blind_bridle";
            RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
            BLIND_BRIDLES.put(color, item);}
    }
    public static final Map<DefaultTackColors, RegistryObject<Item>> DOUBLE_REIN_BRIDLES  = new EnumMap<>(DefaultTackColors.class);
    static {for (DefaultTackColors color : DefaultTackColors.values()) {
            String name = color.getName() + "double_rein_bridle";
            RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
            DOUBLE_REIN_BRIDLES.put(color, item);}
    }
    public static final Map<DefaultTackColors, RegistryObject<Item>> HEAVY_BRIDLES  = new EnumMap<>(DefaultTackColors.class);
    static {for (DefaultTackColors color : DefaultTackColors.values()) {
            String name = color.getName() + "heavy_bridle";
            RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
            HEAVY_BRIDLES.put(color, item);}
    }
    public static final Map<DefaultTackColors, RegistryObject<Item>> LIGHT_BRIDLES  = new EnumMap<>(DefaultTackColors.class);
    static {for (DefaultTackColors color : DefaultTackColors.values()) {
            String name = color.getName() + "light_bridle";
            RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
            LIGHT_BRIDLES.put(color, item);}
    }
    public static final Map<DefaultTackColors, RegistryObject<Item>> RACING_BRIDLES  = new EnumMap<>(DefaultTackColors.class);
    static {for (DefaultTackColors color : DefaultTackColors.values()) {
            String name = color.getName() + "racing_bridle";
            RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
            RACING_BRIDLES.put(color, item);}
    }
    public static final Map<DefaultTackColors, RegistryObject<Item>> SIMPLE_BRIDLES  = new EnumMap<>(DefaultTackColors.class);
    static {for (DefaultTackColors color : DefaultTackColors.values()) {
            String name = color.getName() + "simple_bridle";
            RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
            SIMPLE_BRIDLES.put(color, item);}
    }
    public static final Map<DefaultTackColors, RegistryObject<Item>> WAR_BRIDLES  = new EnumMap<>(DefaultTackColors.class);
    static {for (DefaultTackColors color : DefaultTackColors.values()) {
            String name = color.getName() + "war_bridle";
            RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
            WAR_BRIDLES.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> MEDIEVAL_BRIDLES  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_medieval_bridle";
            RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
            MEDIEVAL_BRIDLES.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> BLACK_MEDIEVAL_BRIDLES  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
        String name = color.getName() + "_black_medieval_bridle";
        RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
        BLACK_MEDIEVAL_BRIDLES.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> WHITE_MEDIEVAL_BRIDLES  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
        String name = color.getName() + "_white_medieval_bridle";
        RegistryObject<Item> item = ITEMS.register(name, BridleItem::new);
        WHITE_MEDIEVAL_BRIDLES.put(color, item);}
    }

    //SADDLES
    public static final Map<DefaultTackColors, RegistryObject<Item>> RACING_SADDLES  = new EnumMap<>(DefaultTackColors.class);
    static {for (DefaultTackColors color : DefaultTackColors.values()) {
        String name = color.getName() + "racing_saddle";
        RegistryObject<Item> item = ITEMS.register(name, () -> new SaddleItem(new Item.Properties().stacksTo(1)));
        RACING_SADDLES.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> MEDIEVAL_SADDLES  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
        String name = color.getName() + "_medieval_saddle";
        RegistryObject<Item> item = ITEMS.register(name, () -> new SaddleItem(new Item.Properties().stacksTo(1)));
        MEDIEVAL_SADDLES.put(color, item);}
    }

    //BLANKETS
    public static final Map<DyeColor, RegistryObject<Item>> PATTERNED_BLANKETS  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_patterned_blanket";
            RegistryObject<Item> item = ITEMS.register(name,
                    () -> new BlanketItem(color, new Item.Properties()));
            PATTERNED_BLANKETS.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> BLACK_LINED_DRESSAGE_BLANKETS  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_dressage_blanket_black_lined";
            RegistryObject<Item> item = ITEMS.register(name,
                    () -> new BlanketItem(color, new Item.Properties()));
        BLACK_LINED_DRESSAGE_BLANKETS.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> WHITE_LINED_DRESSAGE_BLANKETS  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
        String name = color.getName() + "_dressage_blanket_white_lined";
        RegistryObject<Item> item = ITEMS.register(name,
                () -> new BlanketItem(color, new Item.Properties()));
        WHITE_LINED_DRESSAGE_BLANKETS.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> BLACK_LINED_QUARTER_SHEETS  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_quarter_sheet_black_lined";
            RegistryObject<Item> item = ITEMS.register(name,
                    () -> new BlanketItem(color, new Item.Properties()));
            BLACK_LINED_QUARTER_SHEETS.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> WHITE_LINED_QUARTER_SHEETS  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_quarter_sheet_white_lined";
            RegistryObject<Item> item = ITEMS.register(name,
                    () -> new BlanketItem(color, new Item.Properties()));
            WHITE_LINED_QUARTER_SHEETS.put(color, item);}
    }

    //MISC TACK
    public static final Map<DyeColor, RegistryObject<Item>> EAR_HOODS  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_ear_hood";
            RegistryObject<Item> item = ITEMS.register(name,
                    () -> new FaceCosmeticItem(color, new Item.Properties()));
            EAR_HOODS.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> LINED_EAR_HOODS  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_ear_hood_lined";
            RegistryObject<Item> item = ITEMS.register(name,
                    () -> new FaceCosmeticItem(color, new Item.Properties()));
            LINED_EAR_HOODS.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> LEG_WRAPS  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_leg_wraps";
            RegistryObject<Item> item = ITEMS.register(name,
                    () -> new LegsCosmeticItem(color, new Item.Properties()));
            LEG_WRAPS.put(color, item);}
    }
    public static final Map<DyeColor, RegistryObject<Item>> LINED_LEG_WRAPS  = new EnumMap<>(DyeColor.class);
    static {for (DyeColor color : DyeColor.values()) {
            String name = color.getName() + "_leg_wraps_lined";
            RegistryObject<Item> item = ITEMS.register(name,
                    () -> new LegsCosmeticItem(color, new Item.Properties()));
            LINED_LEG_WRAPS.put(color, item);}
    }

    //Mod Item Tab Icon (UNOBTAINABLE)
    public static final RegistryObject<Item> MOUNT_ADDITIONS_LOGO = ITEMS.register("mount_additions_logo",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}