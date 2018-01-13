public class FanAdapter implements Switchable {
    Fan fan;

    public FanAdapter(Fan fan) {
        this.fan = fan;
    }

    public void turnOn() {
        this.fan.turnTo(1);
    }

    public void turnOff() {
        fan.turnTo(0);
    }
}