package com.dragn0007.dragnloequestrian.util;

public enum DefaultTackColors {
    LEATHER(""),
    BLACK("black_"),
    WHITE("white_");

    public final String name;
    public String getName() {return this.name;}
    DefaultTackColors(String name) {this.name = name;}
}
