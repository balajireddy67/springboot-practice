package org.springpractice.cc.beanregistry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springpractice.cc.beanregistry.beans.Engine;
import org.springpractice.cc.beanregistry.beans.Vehicle;
import org.springpractice.cc.beanregistry.config.ProjectConfig;

public class BeanRegistrarExample {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        if (context.containsBean("engine")) {
            Engine engine = context.getBean(Engine.class);
            System.out.println("Engine name = " + engine.getEngineName());
        }
        if (context.containsBean("vehicle")) {
            Vehicle v = context.getBean(Vehicle.class);
            System.out.println("Vehicle name = " + v.getVehName());
            //System.out.println("Vehicle engine = " + v.getEngine());
        }
    }
}
