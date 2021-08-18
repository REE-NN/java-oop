package com.epam.rd.at.java_oop.devices.deviceType.householdApplience;

import com.epam.rd.at.java_oop.devices.deviceType.IConnectable;

public interface ISwitchable extends IConnectable {

    void turnOn(); //включить прибор

    void turnOff(); //выключить
}
