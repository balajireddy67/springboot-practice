package org.springpractice.cc.beanregistry.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springpractice.cc.beanregistry.beans.Engine;
import org.springpractice.cc.beanregistry.beans.Person;
import org.springpractice.cc.beanregistry.beans.Vehicle;

@Configuration
@ComponentScan(basePackages = {"org.springpractice.cc.auto_wiring.beans"})
@Import({MyBeanRegistrar.class})
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

}
