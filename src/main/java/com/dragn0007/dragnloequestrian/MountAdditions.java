package com.dragn0007.dragnloequestrian;

import com.dragn0007.dragnloequestrian.blocks.MABlocks;
import com.dragn0007.dragnloequestrian.common.gui.MAMenuTypes;
import com.dragn0007.dragnloequestrian.items.MAItemGroupModifier;
import com.dragn0007.dragnloequestrian.items.MAItems;
import com.dragn0007.dragnloequestrian.util.MountAdditionsClientConfig;
import com.dragn0007.dragnloequestrian.util.MountAdditionsCommonConfig;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;


@Mod(MountAdditions.MODID)
public class MountAdditions
{
    public static final String MODID = "dragnloequestrian";

    public MountAdditions()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MAItems.register(eventBus);
        MAItemGroupModifier.register(eventBus);
        MABlocks.register(eventBus);
        MAMenuTypes.register(eventBus);

        GeckoLib.initialize();
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MountAdditionsClientConfig.SPEC, "livestock-overhaul-mounts-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MountAdditionsCommonConfig.SPEC, "livestock-overhaul-mounts-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }
}