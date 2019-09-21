package edu.gcccd.csis;

public class Container {

    private Rectangle rectangle;
    private Circle circle;

    public Container() {}

    public Rectangle getRectangle() {
        return rectangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setRectangle(Rectangle rectangle) {
    }

    public void setCircle(Circle circle) {
    }

    public int Size() {

        if(rectangle == null && circle == null)
            return 0;

        return 2;

    }
}
