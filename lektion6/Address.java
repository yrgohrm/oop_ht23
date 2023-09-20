public class Address {
    private String street;
    private String zip;
    private String city;
    private String country;

    public Address(String street, String zip, String city, String country) {
        this.setStreet(street);
        this.setZip(zip);
        this.setCity(city);
        this.setCountry(country);
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", zip=" + zip + ", city=" + city + ", country="
                + country + "]";
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country.toUpperCase();
    }
}
