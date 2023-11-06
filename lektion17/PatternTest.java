// NB!! Only Java 21
public class PatternTest {
    public static void main(String[] args) {
        record Pair(Object x, Object y) {
        }

        Pair p = new Pair("42", new Pair(42, "42"));

        if (p instanceof Pair(String s, String t)) {
            System.out.println(s + ", " + t);
        }
        else if (p instanceof Pair(String s, Pair(Integer i, String s2))) {
            System.out.println(s + " " + i + " " + s2);
        }
        else {
            System.out.println("Not a pair of strings");
        }

    }
}
