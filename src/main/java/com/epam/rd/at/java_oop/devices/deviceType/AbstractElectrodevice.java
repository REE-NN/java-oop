package com.epam.rd.at.java_oop.devices.deviceType;

/**
 * Общий для всех домашних электроприборов класс AbstractElectrodevice implements Connection
 */
public abstract class AbstractElectrodevice implements Connection, Comparable<AbstractElectrodevice> {
    private final int cost;         //цена
    private final int capacity;     //мощность
    private boolean isEnable;       //включено/выключено

    protected AbstractElectrodevice(int price, int capacity) {
        this.cost = price;
        this.capacity = capacity;
        this.isEnable = false;
    }

    public int getCost() {
        return cost;
    }

    public int getMaxPower() {
        return capacity;
    }

    public boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable() {
        isEnable = true;
    }

    public void setIsDisable() {
        isEnable = false;
    }

    @Override
    public int compareTo(AbstractElectrodevice dev) {
        return toString().compareTo(dev.toString());
    }
}
