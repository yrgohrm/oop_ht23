public class TheBestCrmInTheWorld {
    
    public static void main(String[] args) {
        Address acmeAddress = new Address("Storgatan 1", "417 45", "Göteborg", "SWeden");

        Employee ceo = new Employee();
        ceo.setName("Lena Lamm");
        ceo.setJuicyInfo("Gillar Mallorca. Har två döttrar.");
        ceo.setTelephone("0712-34 56 78");

        Company acme = new Company();
        acme.setName("ACME AB");
        acme.setTurnover(10_002_030_223L);
        acme.setAddress(acmeAddress);
        acme.swapCeo(ceo);

        System.out.println(acme);
    }
}
