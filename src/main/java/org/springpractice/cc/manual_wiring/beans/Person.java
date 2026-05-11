package org.springpractice.cc.manual_wiring.beans;

public class Person {
    String name;
    Vehicle vehicle;

    public Person() {
        System.out.println("Person Bean created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
