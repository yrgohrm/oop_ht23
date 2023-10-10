import java.util.*;

public class ShapeMain {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(12.2),
                                     new Rectangle(10, 19),
                                     new Circle(1));

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }

        // Shape s = new Shape();
    }
}
