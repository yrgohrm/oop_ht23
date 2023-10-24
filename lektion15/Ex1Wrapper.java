import java.util.*;

public class Ex1Wrapper {
    public static void main(String[] args) {
        // can't have List<int>
        List<Integer> ints = new ArrayList<>();

        // but we can add ints without problem, they are autoboxed
        ints.add(Integer.valueOf(1));
        ints.add(2);
        ints.add(3);

        // we can assign Integer to int as well, the are unboxed
        int val = ints.get(1);
        System.out.println(val);
    }
}
