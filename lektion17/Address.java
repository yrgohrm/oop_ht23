import java.util.*;

public record Address(String street, String zip, String city, String country) {
    public Address {
        Objects.requireNonNull(street, "must not be null");
        Objects.requireNonNull(zip, "must not be null");
        Objects.requireNonNull(city, "must not be null");
        Objects.requireNonNull(country, "must not be null");
    }
}
