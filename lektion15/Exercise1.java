import java.util.*;

public class Exercise1 {
    public static int evenSum1(List<Integer> numbers) {
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }

    public static int evenSum2(List<Integer> numbers) {
        int sum = 0;

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int theSum = evenSum1(List.of(2,4,6,5,7,8));
        System.out.println(theSum);
    }
}
