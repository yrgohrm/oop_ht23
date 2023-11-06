import java.util.*;

public record Company(String name, String orgno, Address address) {
    public Company {
        Objects.requireNonNull(name, "the company name must not be null");
        Objects.requireNonNull(orgno, "the company org. no. must not be null");
        Objects.requireNonNull(address, "the company address must not be null");
    }
}
