package com.epam.rd.at.java_oop.devices.deviceType.illumination;

public enum DimmerPosition {
    N1(0),
    N2(25),
    N3(50),
    N4(100);

    private final int value;
    DimmerPosition(int value) {
        this.value = value;
    }

    public String toString() {
        return Integer.toString(value);
    }

    int getPowerPercents() { //получить выбранный процент мощности
        return value;
    }
}
