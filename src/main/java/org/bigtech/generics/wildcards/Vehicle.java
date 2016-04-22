package org.bigtech.generics.wildcards;

/**
 * @author Guduru, Thirupathi (TG028792)
 */
public class Vehicle {
    protected int speed;
    protected VehicleType vehicleType;
    public Vehicle(){
        speed = 0;
        vehicleType = VehicleType.UNKNOWN;
    }
    public void defineSpeed(){}
    public void defineType(){}

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder(200);
        sb.append("Vehicle [");
        sb.append("speed=").append(speed);
        sb.append(", vehicleType=").append(vehicleType);
        sb.append("]");
        return sb.toString();
    }
}
