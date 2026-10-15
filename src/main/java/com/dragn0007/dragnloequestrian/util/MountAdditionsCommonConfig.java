package com.dragn0007.dragnloequestrian.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class MountAdditionsCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("General");
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
