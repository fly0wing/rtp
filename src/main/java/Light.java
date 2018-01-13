public class Light {
    private boolean isOn;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
