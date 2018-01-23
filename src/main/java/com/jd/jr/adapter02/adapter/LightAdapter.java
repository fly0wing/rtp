package com.jd.jr.adapter02.adapter;

import com.jd.jr.adapter02.Switchable;
import com.jd.jr.adapter02.equipment.Light;

/**
 * @author zhangkai9@jd.com
 * @date 18-1-23
 */
public class LightAdapter implements Switchable {
    private Light light;

    public LightAdapter(Light light) {
        this.light = light;
    }

    @Override
    public void turnOn() {
        light.turnOn();
    }

    @Override
    public void turnOff() {
        light.turnOff();
    }
}
