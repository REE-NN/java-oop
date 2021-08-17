package com.epam.rd.at.java_oop.devices.deviceFactory;

import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;

/**
 /**
 Класс создаёт случайным образом либо осветительный прибор, либо бытовой электроприбор
 */
public class HoleFactory {

    public AbstractElectrodevice createSomeElectrodevice() {
        AbstractElectrodeviceFactory factory;
        TypeOfDevice type = TypeOfDevice.getRandomElectrodevice();

        switch (type) {
            case HouseholdAppliance:
                factory = new HouseholdApplianceFactory();
                break;
            case Illumination:
                factory = new IlluminationFactory();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + TypeOfDevice.getRandomElectrodevice());
        }
        return factory.createElectrodevice();
    }
}

