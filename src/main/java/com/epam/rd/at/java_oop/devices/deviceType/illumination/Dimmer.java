package com.epam.rd.at.java_oop.devices.deviceType.illumination;

import com.epam.rd.at.java_oop.devices.deviceType.Connection;

/**
 * Общие характеристики димера.
 * Кроме стандартных возможностей выключателя, позволяет устанавливать нужную мощность
 * путём выбора одного из четырёх положений, задано в процентах от полной мощности
 * в перечислении SuppliedPowerPercents
 */
public interface Dimmer extends Connection {

    void setPercentsEnum(Enum<SuppliedPowerPercents> percentsEnum); //установить мощность на димере в процентах

    int getPercentsEnum(); //получить выбранный процент мощности

    int getSuppliedPower(); //получить установленную мощность

}
