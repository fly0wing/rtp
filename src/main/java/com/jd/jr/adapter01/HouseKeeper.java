package com.jd.jr.adapter01;

import java.util.ArrayList;
import java.util.List;

public class HouseKeeper {
    private List<Switchable> switchables = new ArrayList();


    public void masterArriveAtHome() {
        for (Switchable switchable : switchables) {
            switchable.turnOn();
        }
    }

    public void masterLeftHome() {
        for (Switchable switchable : switchables) {
            switchable.turnOff();
        }
    }

    public void addSwitchable(Switchable switchable) {
        switchables.add(switchable);
    }
}
