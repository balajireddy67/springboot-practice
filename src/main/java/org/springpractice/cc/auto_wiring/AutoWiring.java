package org.springpractice.cc.auto_wiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springpractice.cc.auto_wiring.beans.Engine;
import org.springpractice.cc.auto_wiring.beans.Person;
import org.springpractice.cc.auto_wiring.beans.Vehicle;
import org.springpractice.cc.auto_wiring.config.ProjectConfig;

public class AutoWiring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var person = context.getBean(Person.class);
        var vehicle = context.getBean(Vehicle.class);
        var engine = context.getBean(Engine.class);

        System.out.println("Vehicle name " + vehicle.getVehName());
        System.out.println("person name " + person.getName());
        System.out.println(person.getName() + " owns " + person.getVehicle() + " with engine " + person.getEngine());
    }
}
