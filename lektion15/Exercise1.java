import java.util.*;

public class Exercise1 {
    public static int evenSum(List<Integer> numbers) {
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int theSum = evenSum(List.of(2,4,6,5,7,8));
        System.out.println(theSum);
    }
}
