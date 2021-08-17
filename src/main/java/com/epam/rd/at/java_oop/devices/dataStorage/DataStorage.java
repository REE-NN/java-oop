package com.epam.rd.at.java_oop.devices.dataStorage;

import com.epam.rd.at.java_oop.devices.deviceFactory.HoleFactory;
import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;

public class DataStorage {
    private AbstractElectrodevice[] flatDevices;

    public AbstractElectrodevice[] createFlatDevices(int amountOfDevices) {
        AbstractElectrodevice[] flatDevices = new AbstractElectrodevice[amountOfDevices];
        for (int j = 0; j < amountOfDevices; j++) {
            flatDevices[j] = new HoleFactory().createSomeElectrodevice();
        }
        return flatDevices;
    }

    public AbstractElectrodevice[] getFlatDevices() {
        return flatDevices;
    }
}

