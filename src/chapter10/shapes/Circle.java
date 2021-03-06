package chapter10.shapes;

import java.text.DecimalFormat;

public class Circle extends Shape{
//    VARIABLES
    public static final int ANGLES = 0;
    private static int count = 0;

    private int radius;

//    CONSTRUCTORS
    public Circle() {
        this(1);
    }

    public Circle(int radius) {
        this(radius, 0, 0);
    }

    public Circle(int radius, int x, int y) {
        super(x,y);
        this.setRadius(radius);
        count++;
    }

    public Circle(Circle circle) {
        this(circle.getRadius(), circle.getX(), circle.getY());
    }

//    METHODS
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public void scale(float factor) {
        this.radius = (int) Math.max(this.radius * Math.abs(factor), 1);
    }

    public void grow(int d) {
        this.radius = Math.max((this.radius + d), 1);
    }

//    GETTERS & SETTERS
    public static int getCount() {
        return count;
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
                "%nCircle with radius %d at position (%d, %d)%nPerimeter: %s\t\tArea: %s",
                this.getRadius(),
                this.getX(),
                this.getY(),
                new DecimalFormat("#.##").format(this.getPerimeter()),
                new DecimalFormat("#.##").format(this.getArea())
        );
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() + 313 * getRadius();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return this.getRadius() == other.getRadius();
        }
        return false;
    }
}
