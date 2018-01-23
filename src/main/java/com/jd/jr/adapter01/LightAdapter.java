package com.jd.jr.adapter01;

public class LightAdapter implements Switchable {
    Light light;

    public LightAdapter(Light light) {
        this.light = light;
    }

    public void turnOn() {
        this.light.turnOn();
    }

    public void turnOff() {
        this.light.turnOff();
    }
}