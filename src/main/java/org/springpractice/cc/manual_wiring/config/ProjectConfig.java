package org.springpractice.cc.manual_wiring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springpractice.cc.manual_wiring.beans.Person;
import org.springpractice.cc.manual_wiring.beans.Vehicle;

@Configuration
public class ProjectConfig {
    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
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
}
