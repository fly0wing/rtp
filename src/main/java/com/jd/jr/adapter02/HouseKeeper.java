package com.jd.jr.adapter02;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangkai9@jd.com
 * @date 18-1-23
 */
public class HouseKeeper {
    private Set<Switchable> switchables = new HashSet<Switchable>();

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
