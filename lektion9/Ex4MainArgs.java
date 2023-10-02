public class Ex4MainArgs {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);

            if (arg.equals("-l")) {
                System.out.println("nu kan du se rättigheterna...");
            }
        }
    }        
}
