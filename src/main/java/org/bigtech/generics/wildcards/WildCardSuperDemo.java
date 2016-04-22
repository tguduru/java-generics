package org.bigtech.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guduru, Thirupathi Reddy
 */
public class WildCardSuperDemo {

    public static void main(String[] args) {
        List<? super Vehicle> list = new ArrayList<>();
        Car car = new Car();
        car.defineSpeed();
        car.defineType();
        Bike bike = new Bike();
        bike.defineSpeed();
        bike.defineType();
        list.add(car);
        list.add(bike);
        list.forEach(e -> System.out.println(e));
    }
}
