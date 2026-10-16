package com.dragn0007.dragnloequestrian.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class MountAdditionsCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue TRAINING_BUFFS;

    static {
        BUILDER.push("Training");
        TRAINING_BUFFS = BUILDER.comment("Should certain blocks, such as jumps, give a training boost to certain skills? Turning this false may improve performance if these blocks are only used as decor.")
                .define("Training Buff Blocks", true);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
