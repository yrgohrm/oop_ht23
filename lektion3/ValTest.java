public class ValTest {
    public static void main(String[] args) {
        long age = (long) 0xff800000;
        float length = Float.intBitsToFloat(0xff800000);
        System.out.println(age);
        System.out.println(length);
    }
}
