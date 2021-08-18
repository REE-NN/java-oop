package com.epam.rd.at.java_oop.devices.deviceFactory;

/**
 * Типы электроприборов (подтипы приведены в соответствующих названиям перечислениях)
 */
public enum TypeOfDevice {
    HOUSEHOLD_APPLIANCE, //бытовой электроприбор
    ILLUMINATION;       //осветительный прибор

    public static TypeOfDevice getRandomElectrodevice() {
        return values()[(int) (Math.random() * values().length)];
    }
}
