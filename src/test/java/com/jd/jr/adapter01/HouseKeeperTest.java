package com.jd.jr.adapter01;

import com.jd.jr.adapter01.*;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

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

        houseKeeper.masterArriveAtHome();
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

        houseKeeper.masterArriveAtHome();
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

        houseKeeper.masterArriveAtHome();
        houseKeeper.masterLeftHome();

        assertFalse(door.isOpen());
    }
}
