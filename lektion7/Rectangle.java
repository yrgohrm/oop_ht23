import java.io.PrintStream;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
        height = 1;
        width = 2;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void print() {
        System.out.println("print()");
        print(System.out);
    }

    public void print(PrintStream ps) {
        ps.printf("w: %.2f, h: %.2f\n", width, height);
    }

    public void print(int num) {
        System.out.println("print(int)");
        for (int i = 0; i < num; ++i) {
            print();
        }
    }
}

