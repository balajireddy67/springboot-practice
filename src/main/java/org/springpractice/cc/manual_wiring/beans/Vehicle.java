package org.springpractice.cc.manual_wiring.beans;

import org.springframework.context.annotation.Bean;

public class Vehicle {
    String vehName;

    public Vehicle() {
        System.out.println("Vehicle Bean created");
    }

    public String getVehName() {
        return vehName;
    }

    public void setVehName(String vehName) {
        this.vehName = vehName;
    }

    @Override
    public String toString() {
        return "Vehicle: {" + vehName + '}';
    }
}
