public class RectMain2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.setHeight(10);
        r2.setHeight(20);
        r2.setHeight(0);

        r1.print();
        r2.print();
    }
}
