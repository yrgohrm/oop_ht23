import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        Set<String> data = new HashSet<>();
        data.add("Hejsan");
        data.add("Hoppsan");
        data.add("Hej");
        data.add("Hopp");
        data.add("Aha");
        data.add("Zmart");
        data.add("Hejsan");
        data.add("Hejsan");
        data.add("Hejsan");

        for (String value : data) {
            System.out.println(value);
        }
    }
}
