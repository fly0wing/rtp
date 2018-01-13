public class Door {
    private boolean isOpen;

    public void open() {
        this.isOpen = true;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void close() {
        isOpen = false;
    }
}
