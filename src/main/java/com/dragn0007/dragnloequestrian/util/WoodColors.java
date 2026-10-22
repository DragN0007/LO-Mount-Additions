package com.dragn0007.dragnloequestrian.util;

public enum WoodColors {
    ACACIA("acacia"),
    BIRCH("birch"),
    CHERRY("cherry"),
    CRIMSON("crimson"),
    DARK_OAK("dark_oak"),
    JUNGLE("jungle"),
    MANGROVE("mangrove"),
    OAK("oak"),
    SPRUCE("spruce"),
    WARPED("warped");

    public final String name;
    public String getName() {return this.name;}
    WoodColors(String name) {this.name = name;}
}
