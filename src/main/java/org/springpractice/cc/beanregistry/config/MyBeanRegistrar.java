package org.springpractice.cc.beanregistry.config;


import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;
import org.springpractice.cc.beanregistry.beans.Engine;
import org.springpractice.cc.beanregistry.beans.Vehicle;

import java.util.Random;

public class MyBeanRegistrar implements BeanRegistrar {

    @Override
    public void register(BeanRegistry registry, Environment env) {
        int num = new Random().nextInt(100);
        if ((num & 1) == 0) {
            System.out.println("Registering engine bean");
            registry.registerBean("engine", Engine.class, spec -> spec.supplier(
                    context -> {
                        Engine engine = new Engine();
                        engine.setEngineName("V12");
                        return engine;
                    }
            ));
        } else {
            System.out.println("Registering Vehicle bean");
            registry.registerBean("vehicle", Vehicle.class, spec -> spec.supplier(
                    context -> {
                        Vehicle vehicle = new Vehicle();
                        vehicle.setVehName("Benz");
                        return vehicle;
                    }
            ));
        }
    }
}
