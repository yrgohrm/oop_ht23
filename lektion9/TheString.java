public class TheString {
    public static void main(String[] args) {
        String foo = "   hejsan hoppsan   ";

        String bar = foo.trim();
        System.out.println(bar);
        System.out.println(foo);
        
        bar = foo.replace("hej", "oj");
        System.out.println(bar);
        System.out.println(foo);
        
        bar = foo.substring(3, 5);
        System.out.println(bar);
        System.out.println(foo);
        
    }
}
