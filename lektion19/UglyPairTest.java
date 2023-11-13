public class UglyPairTest {
    public static void main(String[] args) {
        UglyPair up1 = new UglyPair("Hej", 123);
        UglyPair up2 = new UglyPair(123.45, true);

        System.out.println(up1.first() + " " + up1.second());
        System.out.println(up2.first() + " " + up2.second());

        int value = (Integer) up1.second();
        System.out.println(value * value);

        int value2 = (Integer) up2.second();
        System.out.println(value2 * value2);


        Pair<String, Integer> p1 = new Pair<>("Hej", 1233);
        Pair<Double, Boolean> p2 = new Pair<>(123.34, true);

        System.out.println(p1.value1() + " " + p1.value2());
        System.out.println(p2.value1() + " " + p2.value2());

        int value3 = p1.value2();
        System.out.println(value3 * value3);

        // Pair p = new Pair("apa", "bepa");
    }

    public static UglyPair doStuff() {
        // ...
        return null;
    }
}
