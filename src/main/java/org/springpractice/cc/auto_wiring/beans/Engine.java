package org.springpractice.cc.auto_wiring.beans;

public class Engine {
    String engineName;

    public Engine() {
        System.out.println("Engine Bean Constructor");
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public String toString() {
        return "Vehicle: {" + engineName + '}';
    }
}
