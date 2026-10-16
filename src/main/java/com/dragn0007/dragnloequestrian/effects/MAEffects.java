package com.dragn0007.dragnloequestrian.effects;

import com.dragn0007.dragnloequestrian.MountAdditions;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MAEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MountAdditions.MODID);

    //todo
    public static final RegistryObject<MobEffect> SPEED_TRAINING = MOB_EFFECTS.register("speed_training",
            () -> new SpeedTrainingEffect(MobEffectCategory.BENEFICIAL, 0x5c0d12));

    public static final RegistryObject<MobEffect> JUMP_TRAINING = MOB_EFFECTS.register("jump_training",
            () -> new SpeedTrainingEffect(MobEffectCategory.BENEFICIAL, 0x5c0d12));

    public static final RegistryObject<MobEffect> CONSITUTION_TRAINING = MOB_EFFECTS.register("consitution_training",
            () -> new SpeedTrainingEffect(MobEffectCategory.BENEFICIAL, 0x5c0d12));

    public static final RegistryObject<MobEffect> ENDURANCE_TRAINING = MOB_EFFECTS.register("endurance_training",
            () -> new SpeedTrainingEffect(MobEffectCategory.BENEFICIAL, 0x5c0d12));

    public static final RegistryObject<MobEffect> BOND_TRAINING = MOB_EFFECTS.register("bond_training",
            () -> new SpeedTrainingEffect(MobEffectCategory.BENEFICIAL, 0x5c0d12));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}