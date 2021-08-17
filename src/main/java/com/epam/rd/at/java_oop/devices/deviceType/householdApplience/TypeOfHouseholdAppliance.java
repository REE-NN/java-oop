package com.epam.rd.at.java_oop.devices.deviceType.householdApplience;

public enum TypeOfHouseholdAppliance {
    IRON,
    TEAPOT,
    WASHER;

    public static TypeOfHouseholdAppliance getRandomHouseholdAppliance() {
        return values()[(int) (Math.random() * values().length)];
    }
}