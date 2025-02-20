package org.patterns.creational.example_abstractfactory;


import org.patterns.creational.example_abstractfactory.factory.EJBAbstractFactory;
import org.patterns.creational.example_abstractfactory.factory.ServicesAbstractFactory;
import org.patterns.creational.example_abstractfactory.services.CarService;
import org.patterns.creational.example_abstractfactory.services.UserService;

public class Client {

    public static void main(String[] args) {
        ServicesAbstractFactory factory = new EJBAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();

        UserService userService = factory.getUserService();
        userService.save("Jhon");
        userService.delete(5);

        CarService carService = factory.getCarService();
        carService.save("Prius");
        carService.update("Tesla X");
    }
}
