public class CompanyTest {
    public static void main(String[] args) {
        Address acmeAddress = null; // new Address("Storgatan 1", "418 72", "Göteborg", "SWEDEN");
        Company acme = new Company("ACME AB", "556273", acmeAddress);

        System.out.printf("Company: %s%nOrganizational number: %s%nAddress: %s%n",
            acme.name(), acme.orgno(), acme.address());
    }
}
