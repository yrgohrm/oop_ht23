public class Chordate extends Animal {
    private int tailLengthMillimeters;

    public Chordate(String name, int tailLengthMillimeters) {
        super(name);
        this.tailLengthMillimeters = tailLengthMillimeters;
    }

    public int getTailLengthMillimeters() {
        return tailLengthMillimeters;
    }

    public double getTailLengthMeters() {
        return tailLengthMillimeters / 1000.0;
    }
}
