package org.patterns.creational.example_factory.factory.create;


import org.patterns.creational.example_factory.factory.model.IPhone;
import org.patterns.creational.example_factory.factory.model.IPhone11;
import org.patterns.creational.example_factory.factory.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone createIPhone(String level) {
        if (level.equals("standard"))
            return new IPhone11();
        else if (level.equals("highEnd"))
            return new IPhone11Pro();

        throw new RuntimeException("Error create IPhone");
    }
}
