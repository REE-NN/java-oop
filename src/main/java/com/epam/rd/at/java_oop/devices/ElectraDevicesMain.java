package com.epam.rd.at.java_oop.devices;

import java.util.Arrays;
import com.epam.rd.at.java_oop.devices.dataStorage.DataStorage;
import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;
import static com.epam.rd.at.java_oop.devices.OperationsWithDevices.sortByCost;
import static com.epam.rd.at.java_oop.devices.OperationsWithDevices.switchOnSomeDevices;
import static com.epam.rd.at.java_oop.devices.OperationsWithDevices.currentPowerConsumption;
import static com.epam.rd.at.java_oop.devices.OperationsWithDevices.deviceWithRequiredPower;

public class ElectraDevicesMain {
    public static void main(String[]args) {

        //AbstractElectrodevice dev1 = new HoleFactory().createSomeElectrodevice();
        // System.out.println(dev1);

        //Создание заданного количества электрических приборов (для условной квартиры)
        AbstractElectrodevice[] flat1 = new DataStorage().createFlatDevices(5);

        //OperationsWithDevices.sortByAll(flat1);

        sortByCost(flat1);
        switchOnSomeDevices(flat1);
        System.out.println(Arrays.toString(flat1));
        currentPowerConsumption(flat1);
        deviceWithRequiredPower(flat1, 30, 100);

        //System.out.println(Electrodevice.getDevices());
    }
}
