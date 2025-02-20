package org.patterns.creational.example_factory.factory.create;


import org.patterns.creational.example_factory.factory.model.IPhone;
import org.patterns.creational.example_factory.factory.model.IPhoneX;
import org.patterns.creational.example_factory.factory.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhone createIPhone(String level) {

        if (level.equals("standard"))
            return new IPhoneX();
        else if (level.equals("highEnd"))
            return new IPhoneXSMax();

        throw new RuntimeException("Error create IPhone");
    }

}
