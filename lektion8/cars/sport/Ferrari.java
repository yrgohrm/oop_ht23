package cars.sport;

import cars.*;

public class Ferrari implements Driveable {

    @Override
    public void turn(double angle) {
        System.out.println("svängelisväng");
    }

    @Override
    public void accelerate(int amount) {
        System.out.println("WROOOM WROOOM!");
    }

    @Override
    public void decelerate(int amount) {
        System.out.println("broms");
    }

    @Override
    public void shiftGear(int gear) {
        System.out.println("klick-klick");
    }
    
    @Override
    public void stop() {
        turn(45);
        decelerate(100);
        shiftGear(1);
    }
}
