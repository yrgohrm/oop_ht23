public class SyncValue {
    private int value = 0;

    public synchronized void set(int value) {
        this.value = value;
    }

    public synchronized int get() {
        return value;
    }
}
