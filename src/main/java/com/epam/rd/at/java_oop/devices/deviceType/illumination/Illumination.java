package com.epam.rd.at.java_oop.devices.deviceType.illumination;

import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;

public class Illumination extends AbstractElectrodevice implements Dimmer {
    private final Enum<TypeOfIllumination> title;  //тип
    private Enum<SuppliedPowerPercents> percentsEnum;
    private boolean isEnable; //включено/выключено
    private int suppliedPower;

    public Illumination(Enum<TypeOfIllumination> name, int price, int capacity) {
        super(price, capacity);
        this.title = name;
        this.isEnable = false;
        this.suppliedPower = 0;
    }

    public Enum<TypeOfIllumination> getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return '\n' + "Осветительный прибор {Наименование=" + title + ", Цена=" + getCost() +
                " руб., Максимальная мощность=" + this.getMaxPower() +
                " Вт, Потребляемая мощность=" + this.suppliedPower +
                " Вт, Прибор включен=" + isEnable +
                '}';
    }

    @Override
    public int getPercentsEnum() {
        return Integer.parseInt(String.valueOf(percentsEnum));
    }

    @Override
    public void setPercentsEnum(Enum<SuppliedPowerPercents> percentsEnum) {
        this.isEnable = true;
        this.percentsEnum = percentsEnum;
        suppliedPower = super.getMaxPower() * getPercentsEnum() / 100;
    }

    @Override
    public int getSuppliedPower() {
        return suppliedPower;
    }

    @Override
    public int getMaxPower() {
        return super.getMaxPower();
    }

    @Override
    public void setIsEnable() {
        setPercentsEnum(SuppliedPowerPercents.N4);
    }

    @Override
    public void setIsDisable() {
        setPercentsEnum(SuppliedPowerPercents.N1);
    }
}
