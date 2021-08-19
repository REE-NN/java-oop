package com.epam.rd.at.java_oop.devices.deviceType.illumination;

import com.epam.rd.at.java_oop.devices.deviceType.IConnectable;

/**
 * Общие характеристики димера.
 * Кроме стандартных возможностей выключателя, позволяет устанавливать нужную мощность
 * путём выбора одного из четырёх положений, задано в процентах от полной мощности
 * в перечислении SuppliedPowerPercents
 */
public interface IDimmerable extends IConnectable {

    void setDimmerPosition(DimmerPosition position); //установить мощность на димере в процентах

    int getDimmerPosition();

    default int calculateSuppliedPower() {
        return getDimmerPosition() == 0 ? 0 : getMaxPower() * getDimmerPosition() / 100;
    }
}