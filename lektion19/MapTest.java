import java.util.*;
import java.util.function.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> theMap = new HashMap<>();

        theMap.put("a", 3);

        BiFunction<Integer, Integer, Integer> func = MapTest::add;
        theMap.merge("a", 1, func);
        theMap.merge("b", 1, func);

        System.out.println(theMap);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
