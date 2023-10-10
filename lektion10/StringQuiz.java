public class StringQuiz {
    public static void main(String[] args) {
        String foo = "straße";
        if (foo.length() != foo.toUpperCase().length()) {
            System.out.println("Kan detta hända? Ja!");
        }
    }
}
