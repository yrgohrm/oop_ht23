public class App {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        System.out.println(numbers[45]);
        numbers[45] = 99;

        int lastIndex = numbers.length-1;
        System.out.println(numbers[lastIndex]);

        int[] numbers2 = { 1, 56, 99, -1 };
        System.out.println(numbers2[3]);

        int[] numbers3 = new int[4];
        numbers3[0] = 1;
        numbers3[1] = 56;
        numbers3[2] = 99;
        numbers3[3] = -1;

        System.out.println();
        for (int num : numbers3) {
            System.out.println(num);
            num = 999;
        }

        System.out.println(numbers3[0]);
    }
}