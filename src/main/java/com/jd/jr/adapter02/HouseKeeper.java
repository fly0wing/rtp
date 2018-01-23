package com.jd.jr.adapter02;

import com.jd.jr.adapter02.adapter.LightAdapter;
import com.jd.jr.adapter02.equipment.Door;
import com.jd.jr.adapter02.equipment.Fan;
import com.jd.jr.adapter02.equipment.Light;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangkai9@jd.com
 * @date 18-1-23
 */
public class HouseKeeper {
    private Set<Switchable> switchables = new HashSet<Switchable>();
    private Set<Light> lights = new HashSet<Light>();
    private Set<Fan> fans = new HashSet<Fan>();
    private Set<Door> doors = new HashSet<Door>();


    public void masterArriveAtHome() {
        for (Switchable switchable : switchables) {
            switchable.turnOn();
        }
        for (Light light : lights) {
            light.turnOn();
        }
        for (Fan fan : fans) {
            fan.turnTo(1);
        }
        for (Door door : doors) {
            door.open();
        }
    }

    public void masterLeftHome() {

        for (Switchable switchable : switchables) {
            switchable.turnOff();
        }
        for (Light light : lights) {
            light.turnOff();
        }
        for (Fan fan : fans) {
            fan.turnTo(0);
        }
        for (Door door : doors) {
            door.close();
        }
    }

    public void addFan(Fan fan) {
        fans.add(fan);
    }

    public void addLight(Light light) {
        lights.add(light);
    }

    public void addDoor(Door door) {
        doors.add(door);
    }

    public void addSwitchable(LightAdapter lightAdapter) {
        switchables.add(lightAdapter);
    }
}
