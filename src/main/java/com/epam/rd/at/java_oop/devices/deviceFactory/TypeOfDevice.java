package com.epam.rd.at.java_oop.devices.deviceFactory;

/**
 * Типы электроприборов (подтипы приведены в соответствующих названиям перечислениях)
 */
public enum TypeOfDevice {
    HouseholdAppliance, //бытовой электроприбор
    Illumination;       //осветительный прибор

    public static TypeOfDevice getRandomElectrodevice() {
        return values()[(int) (Math.random() * values().length)];
    }
}
