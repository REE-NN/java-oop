package com.epam.rd.at.java_oop.devices.deviceType;

/**
 * Общий для всех домашних электроприборов класс AbstractElectrodevice implements Connection
 */
public abstract class AbstractElectrodevice implements IConnectable, Comparable<AbstractElectrodevice> {

    private boolean isEnabled;      //включено/выключено
    private final int cost;         //цена
    private final int maxPower;     //мощность

    protected AbstractElectrodevice(int cost, int maxPower) {
        this.cost = cost;
        this.maxPower = maxPower;
        this.isEnabled = false;
    }

    public int getCost() {
        return cost;
    }

    public int getMaxPower() {
        return maxPower;
    }

    protected void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override
    public int compareTo(AbstractElectrodevice dev) {
        return toString().compareTo(dev.toString());
    }
}

