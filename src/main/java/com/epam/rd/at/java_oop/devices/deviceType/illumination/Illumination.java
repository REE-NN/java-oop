package com.epam.rd.at.java_oop.devices.deviceType.illumination;

import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;

public class Illumination extends AbstractElectrodevice implements IDimmerable {
    private final TypeOfIllumination type;  //тип
    private final String name;
    private DimmerPosition dimmerPosition;

    public Illumination(TypeOfIllumination type, int cost, int maxPower) {
        super(cost, maxPower);
        this.type = type;
        this.name = "Осветительный прибор";
        this.dimmerPosition = DimmerPosition.N1;
    }

    @Override
    public DimmerPosition getDimmerPosition() {
        return dimmerPosition;
    }

    @Override
    public void setDimmerPosition(DimmerPosition position) {
        dimmerPosition = position;
        setEnabled(getDimmerPosition().getPowerPercents() > 0);
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