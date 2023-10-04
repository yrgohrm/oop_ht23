package u2;

public class IceCreamScoop {
    private String flavor;
    private double weight;

    public IceCreamScoop(String flavor, double weight) {
        this.flavor = flavor;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "a scoop of " + flavor + " with weight " + weight + " g";
    }
}
