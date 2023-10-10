import java.util.*;

public class ListEx {
    public static void main(String[] args) {
        List<String> toys = new ArrayList<>(100);

        toys.add("Car");
        toys.add("Monopoly");
        toys.add("Doll");

        for (String toy : toys) {
            System.out.println(toy);
        }

        System.out.println(toys.size());

        System.out.println("index of Doll: " + toys.indexOf("Doll"));
    }
}
