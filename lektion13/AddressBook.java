import java.util.*;

public class AddressBook {
    private List<Address> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, String telephone) {
        contacts.add(new Address(name, telephone));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Address address : contacts) {
            builder.append(address);
            builder.append(System.lineSeparator());
        }
        return builder.toString();
    }
}
