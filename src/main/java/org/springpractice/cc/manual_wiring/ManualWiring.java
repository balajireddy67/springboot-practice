package org.springpractice.cc.manual_wiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springpractice.cc.manual_wiring.beans.Person;
import org.springpractice.cc.manual_wiring.beans.Vehicle;
import org.springpractice.cc.manual_wiring.config.ProjectConfig;

public class ManualWiring {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle = context.getBean(Vehicle.class);
        var person = context.getBean(Person.class);

        System.out.println("Vehicle name " + vehicle.getVehName());
        System.out.println("person name " + person.getName());
        System.out.println(person.getName() + " owns " + person.getVehicle());

    }

}
