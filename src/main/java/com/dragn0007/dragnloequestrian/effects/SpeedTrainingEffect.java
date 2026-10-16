package com.dragn0007.dragnloequestrian.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class SpeedTrainingEffect extends MobEffect {
    public SpeedTrainingEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (!entity.level().isClientSide) {
            if (entity.hasEffect(MAEffects.SPEED_TRAINING.get())) {
                int amp = entity.getEffect(MAEffects.SPEED_TRAINING.get()).getAmplifier();
                int duration = entity.getEffect(MAEffects.SPEED_TRAINING.get()).getDuration();
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}