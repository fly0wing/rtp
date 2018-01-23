package com.jd.jr.adapter01;

public class DoorAdapter implements Switchable {
    private Door door;

    public DoorAdapter(Door door) {
        this.door = door;
    }

    public void turnOn() {
        this.door.open();
    }

    public void turnOff() {
        this.door.close();
    }
}
