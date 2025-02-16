package org.patterns.creational.factory.create;


import org.patterns.creational.factory.model.IPhone;
import org.patterns.creational.factory.model.IPhoneX;
import org.patterns.creational.factory.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhone createIPhone(String level) {

        if (level.equals("standard"))
            return new IPhoneX();
        else if (level.equals("highEnd"))
            return new IPhoneXSMax();

        throw new RuntimeException("Error create IPhone");
    }

}
