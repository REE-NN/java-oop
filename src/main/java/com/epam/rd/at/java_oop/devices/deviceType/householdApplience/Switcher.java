package com.epam.rd.at.java_oop.devices.deviceType.householdApplience;

import com.epam.rd.at.java_oop.devices.deviceType.Connection;

public interface Switcher extends Connection {

    void setSwitchOn(); //включить прибор

    void setSwitchOff(); //выключить
}
