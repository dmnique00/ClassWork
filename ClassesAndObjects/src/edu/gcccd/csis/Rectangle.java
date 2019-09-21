package edu.gcccd.csis;

public class Rectangle {

    private double width;
    private double height;
    private static long numOfRectangles;

    private Rectangle() {
        double width = 2.0;
        double height = 2.0;

    }

    Rectangle rectangle1 = new Rectangle();

    public double getCircumference() {
        return 2 * height + 2 * width;
    }

    public double getArea() {
        return width * height;
    }

    public void setCircumference(double circumference) {
    }

    public void setArea(double area){
    }

    public boolean isSquare() {
        if (height == width) {
            boolean square = true;
        }

        return true;
    }
}
