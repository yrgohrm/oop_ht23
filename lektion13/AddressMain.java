import java.util.*;

public class AddressMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            AddressBook addressBook = new AddressBook();

            addressBook.addContact("Talsvar", "333");

            if (args.length > 0 && args.length % 2 == 0) {
                for (int i = 0; i < args.length-1; i+=2) {
                    addressBook.addContact(args[i], args[i+1]);
                }
            }

            while (true) {
                System.out.println("Skriv in ett namn: ");
                String name = scanner.nextLine();
    
                if (name.trim().isEmpty()) {
                    break;
                }

                System.out.println("Skriv in ett telefonnummer: ");
                String telephone = scanner.nextLine();
    
                addressBook.addContact(name, telephone);
            }


            System.out.println(addressBook);
        }
    }
}
