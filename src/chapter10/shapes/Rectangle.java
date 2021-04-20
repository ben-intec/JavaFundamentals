package chapter10.shapes;

import java.text.DecimalFormat;

public class Rectangle extends Shape{

    //static variables
    public static final int ANGLES = 4;
    private static int count = 0;

    //instance variables
    private int width;
    private int height;

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
        super(x,y);
        this.setWidth(width);
        this.setHeight(height);
        count++;
    }

    //Methods
    public static int getCount() {
        return count;
    }

    public void scale(float factor) {
        factor = Math.abs(factor);
        this.width = (int) Math.max((this.width * factor), 1);
        this.height = (int) Math.max((this.height * factor), 1);
    }

    public void grow(int d) {
        this.width = Math.max((this.width + d), 1);
        this.height = Math.max((this.height + d), 1);
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public double getArea() {
        return this.width * this.height;
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

    @Override
    public String toString() {
        return String.format(
                "%n%s with width: %d, height: %d at position (%d, %d).%nPerimeter: %s\t\tArea: %s",
                this.getClass().getSimpleName(),
                this.getWidth(),
                this.getHeight(),
                this.getX(),
                this.getY(),
                new DecimalFormat("#.##").format(this.getPerimeter()),
                new DecimalFormat("#.##").format(this.getArea())
        );
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() + 17 * getWidth() + 23 * getHeight();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return this.getHeight() == other.getHeight() && this.getWidth() == other.getWidth();
        }
        return false;
    }
}
