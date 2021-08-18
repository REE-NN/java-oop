package com.epam.rd.at.java_oop.devices.deviceType.illumination;

import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;

public class Illumination extends AbstractElectrodevice implements IDimmerable {
    private final TypeOfIllumination type;  //тип
    private final String name;
    private int suppliedPower;

    public Illumination(TypeOfIllumination type, int cost, int maxPower) {
        super(cost, maxPower);
        this.type = type;
        this.suppliedPower = 0;
        this.name = "Осветительный прибор";
    }

    @Override
    public String toString() {
        return '\n' + name + "{Наименование=" + type + ", Цена=" + getCost() +
                " руб., Максимальная мощность=" + this.getMaxPower() +
                " Вт, Потребляемая мощность=" + this.suppliedPower +
                " Вт, Прибор включен=" + isEnabled() +
                '}';
    }

    @Override
    public void setDimmerPosition(DimmerPosition position) {
        setEnabled(position.getPowerPercents() > 0);
        suppliedPower = super.getMaxPower() * position.getPowerPercents() / 100;
    }

    @Override
    public int getSuppliedPower() {
        return suppliedPower;
    }
}
