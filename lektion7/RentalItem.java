public class RentalItem {
    private static double basePrice = 40;
    private String name;
    private double itemPrice;

    public RentalItem(String name, double itemPrice) {
        this.name = name;
        this.itemPrice = itemPrice;
    }

    public double pricePerDay() {
        return basePrice + itemPrice;
    }

    public String toString() {
        return name + " (" + pricePerDay() + ")";
    }

    public static void setBasePrice(double basePrice) {
        RentalItem.basePrice = basePrice;
    }
}
