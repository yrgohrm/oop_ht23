public class Company {
    private String name;
    private long turnover;
    private Address address;
    private Employee ceo;

    public String toString() {
        return String.format("Name: %s%nAddress: %s%nCEO: %s%nTurnover: %d%n",
            name, address, ceo, turnover);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTurnover() {
        return turnover;
    }

    public void setTurnover(long turnover) {
        this.turnover = turnover;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee getCeo() {
        return ceo;
    }

    public void swapCeo(Employee ceo) {
        this.ceo = ceo;
    }
}
