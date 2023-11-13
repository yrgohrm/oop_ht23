import java.util.*;

public class SamePairTest {
    public static void main(String[] args) {
        var pair1 = new SamePair<String>("hej", "hejsan");
        System.out.println(pair1);

        var pair2 = new SamePair<Integer>(19, 84);
        System.out.println(pair2);

        // var pair3 = new SamePair("hej", 123);
        // System.out.println(pair3);

        List<String> list1 = new ArrayList<>(List.of("apa", "bepa"));
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3));
        var pair4 = new SamePair(list1, list2);
        System.out.println(pair4);
    }


    
}
