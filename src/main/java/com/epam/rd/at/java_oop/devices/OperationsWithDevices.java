package com.epam.rd.at.java_oop.devices;

import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;

import java.util.Arrays;
import java.util.Comparator;

public class OperationsWithDevices {

    //эта функция у меня для красоты, она не используется
    static void sortByAll(AbstractElectrodevice[] flat) {
        Arrays.sort(flat);
        System.out.println(Arrays.toString(flat));
    }

    static void sortByCost(AbstractElectrodevice[] flat) {
        Arrays.sort(flat, Comparator.comparingInt(AbstractElectrodevice::getCost));
        System.out.println(Arrays.toString(flat));
    }

    static void switchOnSomeDevices(AbstractElectrodevice[] flat) {
        for (AbstractElectrodevice abstractElectrodevice : flat) {
            boolean randomSwitch = Math.random() >= 0.3;
            if (randomSwitch) {
                abstractElectrodevice.setIsEnable();
            }
        }
    }

    static int currentPowerConsumption(AbstractElectrodevice[] flat) {
        int totalCapacity = 0;
        int totalMaxCapacity = 0;
        for (AbstractElectrodevice abstractElectrodevice : flat) {
            if (abstractElectrodevice.getIsEnable()) {
                totalCapacity += abstractElectrodevice.getSuppliedPower();
            }
            totalMaxCapacity += abstractElectrodevice.getMaxPower();
        }
        System.out.println("\nПотребляемая мощность во всей квартире на данный момент времени= " + totalCapacity + "Вт");
        //оставляю вывод общей мощности приборов, чтобы было с чем сравнивать текущее потребление
        System.out.println("\nОбщая мощность приборов в квартире = " + totalMaxCapacity + "Вт");
        return totalCapacity;
    }

    static void deviceWithRequiredPower(AbstractElectrodevice[] flat, int minCapacity, int maxCapacity) {
        boolean deviceIsExist = false;
        for (AbstractElectrodevice abstractElectrodevice : flat) {
            int currentDevicePower = abstractElectrodevice.getMaxPower();
            if (currentDevicePower >= minCapacity && currentDevicePower <= maxCapacity) {
                System.out.println("\nПрибор с нужной мощностью: " + abstractElectrodevice);
                deviceIsExist = true;
                break;
            }
        }
        if (!deviceIsExist) {
            System.out.println("\nУстройства с мощностью в диапазоне (" + minCapacity + '-' + maxCapacity + "Вт) - немає");
        }
    }
}




