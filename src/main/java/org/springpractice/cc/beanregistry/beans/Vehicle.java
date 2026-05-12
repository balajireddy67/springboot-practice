package org.springpractice.cc.beanregistry.beans;

public class Vehicle {
    String vehName;

    public Vehicle() {
        System.out.println("Vehicle Bean created");
    }

    public String getVehName() {
        return vehName;
    }

    public void setVehName(String vehName) {
        this.vehName = vehName;
    }

    @Override
    public String toString() {
        return "Vehicle: {" + vehName + '}';
    }
}
