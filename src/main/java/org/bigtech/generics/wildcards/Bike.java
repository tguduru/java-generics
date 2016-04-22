package org.bigtech.generics.wildcards;

/**
 * @author Guduru, Thirupathi (TG028792)
 */
public class Bike extends Vehicle {
    @Override public void defineSpeed() {
        speed = 100;
    }

    @Override public void defineType() {
        vehicleType = VehicleType.TWO_WHEELER;
    }
}
