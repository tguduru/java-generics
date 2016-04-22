package org.bigtech.generics.wildcards;

/**
 * @author Guduru, Thirupathi (TG028792)
 */
public class Car extends Vehicle {
    @Override public void defineSpeed() {
        speed = 120;
    }

    @Override public void defineType() {
        vehicleType = VehicleType.FOUR_WHEELER;
    }
}
