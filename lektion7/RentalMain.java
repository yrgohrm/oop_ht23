public class RentalMain {
    public static void main(String[] args) {
        RentalItem drill = new RentalItem("Drill", 100);
        RentalItem skylift = new RentalItem("Skylift", 2500);

        System.out.println(drill);
        System.out.println(skylift);

        RentalItem.setBasePrice(2000);

        System.out.println(drill);
        System.out.println(skylift);

        RentalItem planar = new RentalItem("planar", 1000);
        System.out.println(planar);
    }
}
