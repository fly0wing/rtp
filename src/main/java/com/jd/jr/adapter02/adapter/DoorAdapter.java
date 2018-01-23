package com.jd.jr.adapter02.adapter;

import com.jd.jr.adapter02.Switchable;
import com.jd.jr.adapter02.equipment.Door;

/**
 * @author zhangkai9@jd.com
 * @date 18-1-23
 */
public class DoorAdapter implements Switchable {
    private Door door;

    public DoorAdapter(Door door) {
        this.door = door;
    }

    @Override
    public void turnOn() {
        door.open();
    }

    @Override
    public void turnOff() {
        door.close();
    }
}
