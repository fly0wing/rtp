package com.jd.jr.adapter02.adapter;

import com.jd.jr.adapter02.Switchable;
import com.jd.jr.adapter02.adapter.LightAdapter;
import com.jd.jr.adapter02.equipment.Fan;

/**
 * @author zhangkai9@jd.com
 * @date 18-1-23
 */
public class FanAdapter implements Switchable {

    private Fan fan;

    public FanAdapter(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void turnOn() {
        fan.turnTo(1);
    }

    @Override
    public void turnOff() {
        fan.turnTo(0);
    }
}
