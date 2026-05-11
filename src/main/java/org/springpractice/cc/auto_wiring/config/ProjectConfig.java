package org.springpractice.cc.auto_wiring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springpractice.cc.auto_wiring.beans.Engine;
import org.springpractice.cc.auto_wiring.beans.Person;
import org.springpractice.cc.auto_wiring.beans.Vehicle;

@Configuration
public class ProjectConfig {
    @Bean
    public Person person(Vehicle vehicle, Engine engine) {
        Person person = new Person(engine);
        person.setName("Lelouch");
        person.setVehicle(vehicle);
        return person;
    }

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehName("Audi");
        return vehicle;
    }

//    @Bean
//    public Person person() {
//        Person person = new Person();
//        person.setName("Lelouch");
//        person.setVehicle(vehicle());
//        return person;
//    }

    @Bean
    public Engine engine() {
        Engine engine = new Engine();
        engine.setEngineName("v8");
        return engine;
    }
}
