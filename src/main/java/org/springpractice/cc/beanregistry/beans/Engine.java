package org.springpractice.cc.beanregistry.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    String engineName;

    public Engine() {
        System.out.println("Engine Bean created");
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

//    @PostConstruct
//    public void initialize() {
//        this.engineName = "v8";
//    }

    @Override
    public String toString() {
        return "Vehicle: {" + engineName + '}';
    }
}
