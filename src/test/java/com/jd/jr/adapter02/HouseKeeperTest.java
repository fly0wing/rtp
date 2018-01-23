package com.jd.jr.adapter02;


import com.jd.jr.adapter02.adapter.DoorAdapter;
import com.jd.jr.adapter02.adapter.FanAdapter;
import com.jd.jr.adapter02.adapter.LightAdapter;
import com.jd.jr.adapter02.equipment.Door;
import com.jd.jr.adapter02.equipment.Fan;
import com.jd.jr.adapter02.equipment.Light;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HouseKeeperTest {
    @Test
    public void should_turn_on_light_when_master_arrive_at_home() throws Exception {
        Light light = new Light();
        HouseKeeper houseKeeper = new HouseKeeper();
        houseKeeper.addSwitchable(new LightAdapter(light));
        houseKeeper.masterArriveAtHome();

        assertTrue(light.isOn());
    }

    @Test
    public void should_turn_off_light_when_master_left_home() throws Exception {
        Light light = new Light();
        HouseKeeper houseKeeper = new HouseKeeper();
        houseKeeper.addSwitchable(new LightAdapter(light));
        houseKeeper.masterLeftHome();

        assertFalse(light.isOn());
    }

    @Test
    public void should_turn_on_fan_when_master_arrive_at_home() throws Exception {
        Fan fan = new Fan();
        HouseKeeper houseKeeper = new HouseKeeper();
        houseKeeper.addSwitchable(new FanAdapter(fan));
        houseKeeper.masterArriveAtHome();

        assertTrue(fan.isRunning());
    }

    @Test
    public void should_turn_off_fan_when_master_left_home() throws Exception {
        Fan fan = new Fan();
        HouseKeeper houseKeeper = new HouseKeeper();
        houseKeeper.addSwitchable(new FanAdapter(fan));
        houseKeeper.masterLeftHome();

        assertFalse(fan.isRunning());
    }

    @Test
    public void should_open_door_when_master_arrive_at_home() throws Exception {
        Door door = new Door();
        HouseKeeper houseKeeper = new HouseKeeper();
        houseKeeper.addSwitchable(new DoorAdapter(door));
        houseKeeper.masterArriveAtHome();

        assertTrue(door.isOpen());
    }

    @Test
    public void should_close_door_when_master_left_home() throws Exception {
        Door door = new Door();
        HouseKeeper houseKeeper = new HouseKeeper();
        houseKeeper.addSwitchable(new DoorAdapter(door));
        houseKeeper.masterLeftHome();

        assertFalse(door.isOpen());
    }
}
