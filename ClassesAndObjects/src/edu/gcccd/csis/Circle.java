package edu.gcccd.csis;


public class Circle {

    private final double radius;
    private String color;
    private static long numOfCircles;

    public Circle(double radius) {
        this.color = "blue";
        this.radius = 1.0;
    }
    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setColor(String color) {
    }

    public void setCircumference(double circumference) {
    }
    public void setArea(double area){
    }
}


