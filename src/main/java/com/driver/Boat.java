package com.driver;

public class Boat implements WaterVehicle{
    private String vehicleName;
    private int capacity;

    public Boat(String vehicleName, int capacity){
        this.vehicleName=vehicleName;
        this.capacity=capacity;
    }

    @Override
    public String getVehicleName() {
        return vehicleName;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
