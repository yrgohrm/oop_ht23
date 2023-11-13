import java.util.*;

public class Utils {

    public static <T> boolean allSame(List<T> values, Comparator<T> comp) {
        if (values.isEmpty()) {
            return true;
        }

        T first = values.get(0);
        for (T val : values) {
            if (comp.compare(first, val) != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<String> stringsSame = List.of("hej", "hej", "hej");
        List<String> stringsNotSame = List.of("hej", "hejsan", "hej");

        boolean isSame = allSame(stringsSame, Comparator.naturalOrder());
        System.out.println("stringSame: " + isSame);

        isSame = allSame(stringsNotSame, Comparator.naturalOrder());
        System.out.println("stringNotSame: " + isSame);

        List<Integer> intList = List.of(1,1,1,1,1,1,1);
        isSame = allSame(intList, Comparator.naturalOrder());
        System.out.println(isSame);
    }
}
