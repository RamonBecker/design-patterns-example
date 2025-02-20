package org.patterns.creational.example_factory.factory;

import org.patterns.creational.example_factory.factory.create.IPhone11Factory;
import org.patterns.creational.example_factory.factory.create.IPhoneFactory;
import org.patterns.creational.example_factory.factory.create.IPhoneXFactory;
import org.patterns.creational.example_factory.factory.model.IPhone;

public class Client {
    public static void main(String[] args) {

        IPhoneFactory genXFactory = new IPhoneXFactory();
        IPhoneFactory gen11Factory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphoneXStandard = genXFactory.orderIPhone("standard");
        System.out.println(iphoneXStandard);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone11HighEnd = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone11HighEnd);
    }
}
