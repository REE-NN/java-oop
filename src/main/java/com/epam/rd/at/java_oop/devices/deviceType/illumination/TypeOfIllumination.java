package com.epam.rd.at.java_oop.devices.deviceType.illumination;

public enum TypeOfIllumination {
            LAMP,
            CHANDELIER;

    public static TypeOfIllumination getRandomIllumination() {
        return values()[(int) (Math.random() * values().length)];
    }
}

