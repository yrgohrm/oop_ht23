public record AddressNew(String name, String street, String zip, String city, String country) {
    public AddressNew {
        if (name.isBlank() || street.isBlank()) {
            throw new IllegalArgumentException("there must be a name!");
        }


    }

    public void printPostcard() {
        System.out.println("To: " + name);
        System.out.println(street);
    }
}
