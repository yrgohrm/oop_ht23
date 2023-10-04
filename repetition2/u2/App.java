package u2;

public class App {
    public static void main(String[] args) {
        IceCreamScoop theScoop = new IceCreamScoop("vanilla", 100);

        IceCream theIceCream = new IceCream("cone");
        theIceCream.addScoop(theScoop);
        theIceCream.addScoop(new IceCreamScoop("chocolate", 86));
        theIceCream.addScoop(new IceCreamScoop("melon", 126));

        System.out.println(theIceCream);
    }
}
