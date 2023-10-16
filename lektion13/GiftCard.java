public class GiftCard {
    private double amount;

    public GiftCard(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("you cheap bastard!");
        }

        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
