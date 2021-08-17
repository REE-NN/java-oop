package com.epam.rd.at.java_oop.devices.deviceType.householdApplience;

import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;

public class HouseholdAppliances extends AbstractElectrodevice implements Switcher {
    private final Enum<TypeOfHouseholdAppliance> title;  //тип
    private final String name;

    public HouseholdAppliances(Enum<TypeOfHouseholdAppliance> name, int price, int capacity) {
        super(price, capacity);
        this.title = name;
        this.name = "Бытовой электроприбор";
    }

    public Enum<TypeOfHouseholdAppliance> getTitle() {
        return title;
    }

    @Override
    public int getMaxPower() {
        return super.getMaxPower();
    }

    @Override
    public int getSuppliedPower() {
        if (getIsEnable()) {
            return super.getMaxPower();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return '\n' + name + "{Наименование=" + title + ", Цена=" + getCost() +
                " руб., Максимальная мощность=" + this.getMaxPower() +
                " Вт, Потребляемая мощность=" + this.getSuppliedPower() +
                " Вт,Прибор включен=" + getIsEnable() +
                '}';
    }

    @Override
    public void setSwitchOn() {
        setIsEnable();
    }

    @Override
    public void setSwitchOff() {
        setIsDisable();
    }

}