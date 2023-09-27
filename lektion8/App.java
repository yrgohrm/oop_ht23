import cars.*;
import cars.boring.*;
import cars.sport.*;
import cars.sport.Porsche;

public class App {
    public static void main(String[] args) {

        Driveable someCar = new FordSMax();

        someCar.accelerate(10);
        someCar.turn(10);
        someCar.shiftGear(5);
        System.out.println();

        showCar(new Ferrari());
        showCar(new Porsche());
        showCar(new FordSMax());
    }

    private static void showCar(Driveable car) {
        car.accelerate(10);
        car.turn(12);
        car.decelerate(12);
        car.shiftGear(4);
        car.stop();
        System.out.println();
    }
}