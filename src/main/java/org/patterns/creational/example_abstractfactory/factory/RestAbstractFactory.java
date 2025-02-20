package org.patterns.creational.example_abstractfactory.factory;


import org.patterns.creational.example_abstractfactory.services.CarRestApiService;
import org.patterns.creational.example_abstractfactory.services.CarService;
import org.patterns.creational.example_abstractfactory.services.UserRestApiService;
import org.patterns.creational.example_abstractfactory.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
