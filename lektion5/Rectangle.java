public class Rectangle {
    private double height;
    private double width;
    private String color;

    public void print() {
        System.out.println("Rectangle:");
        System.out.printf("\theight: %.2f%n", height);
        System.out.printf("\twidth:  %.2f%n", width);
        System.out.printf("\tcolor:  %s%n", color);
        System.out.printf("\tarea:  %s%n", area());
    }

    /**
     * Return the height in meters.
     * 
     * @return height in meters.
     */
    public double getHeight() {
        return height / 1000;
    }

    /**
     * Set the height of the rectangle, in meters. Must be a positivt number.
     *
     * @param height the height in meters.
     */
    public void setHeight(double height) {
        if (height < 0) {
            //....
        }

        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        return width * height;
    }


    public void setWidthByArea(double area) {
        double newWidth = area / height;
        width = newWidth;
    }


    public double getHeight(boolean metric) {
        if (metric) {
            return height;
        }
        
        return height / 2.54;
    }

}
