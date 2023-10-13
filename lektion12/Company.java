import java.util.*;

public class Company {
    private String name;
    private List<Contact> contacts;
    private List<Invoice> invoices;

    public Company(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
        this.invoices = new ArrayList<>();
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return new ArrayList<>(contacts);
    }

    public List<Invoice> getInvoices() {
        return new ArrayList<>(invoices);
    }

    public List<Invoice> getIncomingInvoices() {
        return invoices.stream().filter(Invoice::isIncoming).toList();
    }

    @Override
    public String toString() {
        return "Company [name=" + name + ", contacts=" + contacts + ", invoices=" + invoices + "]";
    }

    
}
