public class Example1 {
    public static void main(String[] args) {
        int x = 22, y = 12, z = 3;
        int res = x + y * z;
        System.out.println("Resultat: " + res);

        double e = 27;
        double f = 133 / e;
        System.out.println("Resultat: " + f);

        int g = 27;
        int h = 133 / g;
        System.out.println("Resultat: " + h);

        // går ej så här
        // int val = 0.5 + 10.5;

        double val = 5 + 10;
        System.out.println(val);

        int val2 = (int) (5 + 10.5);
        System.out.println(val2);

        byte theByte = (byte) 900;
        System.out.println(theByte);

        theByte = (byte) 27;
        System.out.println(theByte);

        int complex = 5 + (3 - (8 - (4 - 5)));
        System.out.println(complex);
    }
}
