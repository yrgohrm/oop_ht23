package u1;

public class AssignmentOne {
    public static void triangle(char ch, int size, boolean pointFirst) {
        if (pointFirst) {
            // peka upp
            for (int i = 0; i < size; i++) {
                String part = ("" + ch).repeat(i+1);
                System.out.println(part);

                // for (int j = 0; j <= i; j++) {
                //     System.out.print(ch);
                // }
                // System.out.println();
            }
        }
        else {
            // peka ner
            for (int i = 0; i < size; i++) {
                String part = ("" + ch).repeat(size-i);
                System.out.println(part);

                // for (int j = 0; j < size - i; j++) {
                //     System.out.print(ch);
                // }
                // System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        triangle('x', 7, true);
        triangle('*', 6, false);
    }
}
