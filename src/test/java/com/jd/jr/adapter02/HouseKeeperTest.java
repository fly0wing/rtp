package com.jd.jr.adapter02;


import com.jd.jr.adapter02.HouseKeeper;
import com.jd.jr.adapter02.equipment.Light;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HouseKeeperTest {
    @Test
    public void should_turn_on_light_when_master_arrive_at_home() throws Exception {
        Light light = new Light();
        HouseKeeper houseKeeper = new HouseKeeper();
        houseKeeper.addLight(light);
        houseKeeper.masterArriveAtHome();

        assertTrue(light.isOn());
    }

    @Test
    public void should_turn_off_light_when_master_left_home() throws Exception {
        Light light = new Light();
        HouseKeeper houseKeeper = new HouseKeeper();
        houseKeeper.addLight(light);
        houseKeeper.masterLeftHome();

        assertFalse(light.isOn());
    }

}
