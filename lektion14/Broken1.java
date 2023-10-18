import java.util.*;
import java.util.concurrent.*;

public class Broken1 {
    private static int min(List<Integer> values) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("list must contain values");
        }

        int minValue = values.get(0);

        for (int i = 1; i < values.size(); ++i) {
            int value = values.get(i);
            if (minValue > value) {
                minValue = value;
            }
        }

        return minValue;
    }

    public static void xxxmain(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        int i;
        while ((i = scanner.nextInt()) != 0) {
            values.add(i);
        }        
        System.out.println("Min value: " + min(values));
    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; ++i) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < ThreadLocalRandom.current().nextInt(100)+1; j++) {
                list.add(ThreadLocalRandom.current().nextInt());
            }
            min(list);
        }
    }
}
