package com.epam.rd.at.java_oop.devices.deviceType;

/**
 * Общие характеристики подключения, в дальнейшем разделяются на
 * интерфейсы: 1)обычный выключатель (Switcher), 2)диммер (Dimmer switch)
 */

public interface Connection {

    int getMaxPower(); //мощность прибора как характеристика

    int getSuppliedPower(); //мощность с которой включили прибор, если прибор не в сети Electric power (P) = 0 W

    boolean getIsEnable(); //узнать состояние прибора (включен или выключен)

}