package com.epam.rd.at.java_oop.devices.deviceFactory;

import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;
import com.epam.rd.at.java_oop.devices.deviceType.householdApplience.HouseholdAppliances;
import com.epam.rd.at.java_oop.devices.deviceType.householdApplience.TypeOfHouseholdAppliance;

/**
 Класс создаёт рандомный бытовой электроприбор, с рандомными же характеристиками.
 */
public class HouseholdApplianceFactory implements IAbstractElectrodeviceFactory {
    private final int price = (int) (Math.random() * 3000); //цена от
    private final int power = (int) (Math.random() * 100 + 300);

    @Override
    public AbstractElectrodevice createElectrodevice() {
        return new HouseholdAppliances(TypeOfHouseholdAppliance.getRandomHouseholdAppliance(), price, power);
    }
}
