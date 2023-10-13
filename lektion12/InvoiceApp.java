public class InvoiceApp {
    public static void main(String[] args) {
        Company acme = new Company("ACME AB");
        Company bossessvets = new Company("Bosses Svets AB");

        Contact lena = new Contact("Lena Lamm");
        Contact bosse = new Contact("Bosse Bredsladd");

        acme.addContact(lena);
        bossessvets.addContact(bosse);

        Invoice invoice = new Invoice(1222, bosse, true);
        acme.addInvoice(invoice);

        System.out.println(acme);
    }
}
