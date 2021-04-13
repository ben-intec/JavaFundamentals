package chapter8;

import java.text.DecimalFormat;

public class Rectangle {

    //static variables
    public static final int ANGLES = 4;
    private static int count = 0;

    //instance variables
    private int width;
    private int height;
    private int x;
    private int y;

    //Constructors
    public Rectangle() {
        this(1, 2);
    }

    public Rectangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getWidth(), rectangle.getHeight(), rectangle.getX(), rectangle.getY());
    }

    public Rectangle(int width, int height, int x, int y) {
        this.setWidth(width);
        this.setHeight(height);
        this.setPosition(x,y);
        count++;
    }

    //Methods
    public static int getCount() {
        return count;
    }

    public void scale(float factor) {
        factor = Math.abs(factor);
        this.width *= factor;
        this.height *= factor;
    }

    public void grow(int d) {
        this.width = Math.max((this.width + d), 0);
        this.height = Math.max((this.height + d), 0);
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public double getArea() {
        return this.width * this.height;
    }

    public void setPosition(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    //Property Getters and Setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = Math.abs(height);
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

    @Override
    public String toString() {
        return String.format(
                "Rectangle with width: %d, height: %d at position (%d, %d).%nPerimeter: %s\t\tArea: %s%n",
                this.getWidth(),
                this.getHeight(),
                this.getX(),
                this.getY(),
                new DecimalFormat("#.##").format(this.getPerimeter()),
                new DecimalFormat("#.##").format(this.getArea())
        );
    }
}
