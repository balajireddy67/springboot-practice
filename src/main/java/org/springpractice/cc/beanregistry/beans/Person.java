package org.springpractice.cc.beanregistry.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    String name;

    //@Autowired //field injection
    Vehicle vehicle;
    Engine engine;

    public Person() {
        System.out.println("Person Bean created");
    }

    @Autowired //constructor injection
    public Person(Engine engine) {
        this.engine = engine;
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

    @Autowired //setter-injection
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Engine getEngine() {
        return engine;
    }

//    @Autowired
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
}
