public class App {
    public static void main(String[] args) {
        Clock clock = new Clock();

        clock.printTime();
        clock.printTime("engelska");
        clock.printTime(5);
        clock.printTime(5, "engelska");

        
        int res = SuperMath.superAdd(12, 345);
        System.out.println(res);
    }
}