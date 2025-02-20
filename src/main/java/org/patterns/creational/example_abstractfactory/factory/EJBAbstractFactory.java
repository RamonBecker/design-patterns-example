package org.patterns.creational.example_abstractfactory.factory;


import org.patterns.creational.example_abstractfactory.services.CarEJBService;
import org.patterns.creational.example_abstractfactory.services.CarService;
import org.patterns.creational.example_abstractfactory.services.UserEJBService;
import org.patterns.creational.example_abstractfactory.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



