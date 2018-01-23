package com.jd.jr.adapter02;

import com.jd.jr.adapter02.equipment.Door;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangkai9@jd.com
 * @date 18-1-23
 */
public class HouseKeeper {
    private Set<Switchable> switchables = new HashSet<Switchable>();
    private Set<Door> doors = new HashSet<Door>();


    public void masterArriveAtHome() {
        for (Switchable switchable : switchables) {
            switchable.turnOn();
        }
        for (Door door : doors) {
            door.open();
        }
    }

    public void masterLeftHome() {

        for (Switchable switchable : switchables) {
            switchable.turnOff();
        }
        for (Door door : doors) {
            door.close();
        }
    }


    public void addDoor(Door door) {
        doors.add(door);
    }

    public void addSwitchable(Switchable lightAdapter) {
        switchables.add(lightAdapter);
    }
}
