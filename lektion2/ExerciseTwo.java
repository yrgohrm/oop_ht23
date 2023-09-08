public class ExerciseTwo {
    public static void main(String[] args) {
        double radius = 12.3;
        // code goes here, use StrictMath.PI

        double circumference = 2 * StrictMath.PI * radius;
        double area =  radius * radius * StrictMath.PI;
/
        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", area);
    }
}
