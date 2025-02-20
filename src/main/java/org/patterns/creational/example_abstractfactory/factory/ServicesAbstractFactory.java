package org.patterns.creational.example_abstractfactory.factory;


import org.patterns.creational.example_abstractfactory.services.CarService;
import org.patterns.creational.example_abstractfactory.services.UserService;

public interface ServicesAbstractFactory {

    UserService getUserService();

    CarService getCarService();
}
