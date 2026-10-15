package com.dragn0007.dragnloequestrian.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class MountAdditionsClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Client");
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
