package com.epam.rd.at.java_oop.devices.deviceFactory;

import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;

/**
 /**
 Класс создаёт случайным образом либо осветительный прибор, либо бытовой электроприбор
 */
public class HoleFactory {

    public AbstractElectrodevice createSomeElectrodevice() {
        IAbstractElectrodeviceFactory factory;
        TypeOfDevice type = TypeOfDevice.getRandomElectrodevice();

        switch (type) {
            case HOUSEHOLD_APPLIANCE:
                factory = new HouseholdApplianceFactory();
                break;
            case ILLUMINATION:
                factory = new IlluminationFactory();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + TypeOfDevice.getRandomElectrodevice());
        }
        return factory.createElectrodevice();
    }
}

