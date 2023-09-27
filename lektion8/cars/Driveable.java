package cars;

public interface Driveable {
    void turn(double angle);

    void accelerate(int amount);

    void decelerate(int amount);

    void shiftGear(int gear);

    default void stop() {
        turn(0);
        decelerate(100);
        shiftGear(1);
    }
}
