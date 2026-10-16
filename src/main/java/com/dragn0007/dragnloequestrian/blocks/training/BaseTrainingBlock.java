package com.dragn0007.dragnloequestrian.blocks.training;

import com.dragn0007.dragnlivestock.entities.util.AbstractOMount;
import com.dragn0007.dragnloequestrian.util.MountAdditionsCommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class BaseTrainingBlock extends Block {
    public BaseTrainingBlock(Properties properties) {super(properties);}

    public MobEffectInstance trainingEffect() {return null;}

    public boolean isRandomlyTicking(BlockState state) {return true;}

    //todo
    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {
        if (!level.isAreaLoaded(pos, 1) || !MountAdditionsCommonConfig.TRAINING_BUFFS.get()) return;

        double range = 4.0;
        AABB searchBox = new AABB(pos).inflate(range);
        List<AbstractOMount> nearbyMounts = level.getEntitiesOfClass(AbstractOMount.class, searchBox);

        for (AbstractOMount animal : nearbyMounts) {
//            if (animal.isVehicle())
                animal.addEffect(trainingEffect());
        }
    }
}
