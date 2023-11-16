import java.util.*;

public class Generics {
    public static void main(String[] args) {
        record FloopyPoopy(int i, int j) {}

        List<FloopyPoopy> someList = new ArrayList<>();

        someList.add(new FloopyPoopy(0, 0));
        FloopyPoopy foo = someList.get(0);
        System.out.println(foo);

        List<String> names = List.of("Hampus", "Bosse", "Lena");

        for (String name : names) {
            System.out.println(name);
        }
    }
}