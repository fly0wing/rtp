package com.jd.jr.adapter02;

import com.jd.jr.adapter02.equipment.Light;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangkai9@jd.com
 * @date 18-1-23
 */
public class HouseKeeper {
    private Set<Light> lights = new HashSet<Light>();

    public void addLight(Light light) {
        lights.add(light);
    }

    public void masterArriveAtHome() {
        for (Light light : lights) {
            light.turnOn();
        }
    }

    public void masterLeftHome() {
        for (Light light : lights) {
            light.turnOff();
        }
    }
}
