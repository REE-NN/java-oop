package com.epam.rd.at.java_oop.devices.deviceFactory;

import com.epam.rd.at.java_oop.devices.deviceType.AbstractElectrodevice;
import com.epam.rd.at.java_oop.devices.deviceType.illumination.Illumination;
import com.epam.rd.at.java_oop.devices.deviceType.illumination.TypeOfIllumination;

/**
 Класс создаёт рандомный осветительный электроприбор, с рандомными же характеристиками.
 */
public class IlluminationFactory implements AbstractElectrodeviceFactory {
    private final int price = (int) (Math.random() * 1500); //цена от
    private final int power = (int) (Math.random() * 10 + 30);

    @Override
    public AbstractElectrodevice createElectrodevice() {
        return new Illumination(TypeOfIllumination.getRandomIllumination(), price, power);
    }
}
