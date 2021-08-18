package com.epam.rd.at.java_oop.devices.deviceType.householdApplience;

import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;

public class HouseholdAppliances extends AbstractElectrodevice implements ISwitchable {
    private final TypeOfHouseholdAppliance type;  //тип
    private final String name;

    public HouseholdAppliances(TypeOfHouseholdAppliance type, int cost, int maxPower) {
        super(cost, maxPower);
        this.type = type;
        this.name = "Бытовой электроприбор";
    }

    @Override
    public void turnOn() {
        setEnabled(true);
    }

    @Override
    public void turnOff() {
        setEnabled(false);
    }

    @Override
    public int getSuppliedPower() {
        if (isEnabled()) {
            return getMaxPower();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return '\n' + name + "{Наименование=" + type + ", Цена=" + getCost() +
                " руб., Максимальная мощность=" + this.getMaxPower() +
                " Вт, Потребляемая мощность=" + this.getSuppliedPower() +
                " Вт, Прибор включен=" + isEnabled() +
                '}';
    }
}