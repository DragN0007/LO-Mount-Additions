package com.dragn0007.dragnloequestrian.client.event;

import com.dragn0007.dragnloequestrian.MountAdditions;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = MountAdditions.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MountsClientEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public static void entityRenderersEvent(EntityRenderersEvent.RegisterRenderers event) {
    }

    @SubscribeEvent
    public static void modelRegistryEvent(ModelEvent.RegisterGeometryLoaders event) {
    }
}