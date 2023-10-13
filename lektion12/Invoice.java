public class Invoice {
    private double total;
    private Contact contact;
    private boolean incoming;

    public Invoice(double total, Contact contact, boolean incoming) {
        this.total = total;
        this.contact = contact;
        this.incoming = incoming;
    }

    public double getTotal() {
        return total;
    }

    public Contact getContact() {
        return contact;
    }    

    public boolean isIncoming() {
        return incoming;
    }

    @Override
    public String toString() {
        return "Invoice [total=" + total + ", contact=" + contact + ", incoming=" + incoming + "]";
    }

    
}
