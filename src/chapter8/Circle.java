package chapter8;

import java.text.DecimalFormat;

public class Circle {
//    VARIABLES
    public static final int ANGLES = 0;
    private static int count = 0;

    private int radius;
    private int x;
    private int y;

//    CONSTRUCTORS
    public Circle() {
        this(1);
    }

    public Circle(int radius) {
        this(radius, 0, 0);
    }

    public Circle(int radius, int x, int y) {
        this.setRadius(radius);
        this.setPosition(x,y);
        count++;
    }

    public Circle(Circle circle) {
        this(circle.getRadius(), circle.getX(), circle.getY());
    }

//    METHODS
    public void setPosition(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public void scale(float factor) {
        this.radius *= Math.abs(factor);
    }

    public void grow(int d) {
        this.radius = Math.max((this.radius + d), 0);
    }

//    GETTERS & SETTERS
    public static int getCount() {
        return count;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = Math.abs(radius);
    }

    @Override
    public String toString() {
        return String.format(
                "Circle with radius %d at position (%d, %d)%nPerimeter: %s\t\tArea: %s%n",
                this.getRadius(),
                this.getX(),
                this.getY(),
                new DecimalFormat("#.##").format(this.getPerimeter()),
                new DecimalFormat("#.##").format(this.getArea())
        );
    }
}
