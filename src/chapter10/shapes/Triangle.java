package chapter10.shapes;

import java.text.DecimalFormat;

public class Triangle extends Shape {
    
    //static variables
    public static final int ANGLES = 3;
    private static int count = 0;
    
    //INSTANCE VARIABLES
    private int width; //base
    private int height;
    private int perpendicular; //projection of the height onto the base
    
    //CONSTRUCTORS
    public Triangle() {
        this(3, 2, 1);
    }
    
    public Triangle(Triangle triangle) {
        this(triangle.width, triangle.height, triangle.perpendicular, triangle.getX(), triangle.getY());
    }
    public Triangle(int width, int height, int perpendicular) {
        this(width, height, perpendicular, 0, 0);
    }
    
    public Triangle(int width, int height, int perpendicular, int x, int y) {
        super(x, y);
        this.setWidth(width);
        this.setHeight(height);
        this.perpendicular = perpendicular;
        count++;
    }
    
    //STATIC METHODS
    public static int getCount() {
        return count;
    }
    
    //INSTANCE METHODS
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
    
    public int getPerpendicular() {
        return perpendicular;
    }
    
    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }
    
    //OVERRIDES
    @Override
    void scale(float factor) {
        factor = Math.abs(factor);
        this.width = (int) Math.max((this.width * factor), 1);
        this.height = (int) Math.max((this.height * factor), 1);
    }
    
    @Override
    void grow(int d) {
        this.width = Math.max((this.width + d), 1);
        this.height = Math.max((this.height + d), 1);
    }
    
    @Override
    double getPerimeter() {
        if (perpendicular < 0 || perpendicular > width)
            return width + Math.hypot(height, perpendicular) + Math.hypot(height, perpendicular - width);
        else
            return width + Math.hypot(height, perpendicular) + Math.hypot(height, width - perpendicular);
    }
    
    @Override
    double getArea() {
        return (this.width * this.height) / 2D;
    }
    @Override
    public String toString() {
        return String.format(
                "%n%s with width: %d, height: %d, perpendicular: %d at position (%d, %d).%nPerimeter: %s\t\tArea: %s",
                this.getClass().getSimpleName(),
                this.getWidth(),
                this.getHeight(),
                this.getPerpendicular(),
                this.getX(),
                this.getY(),
                new DecimalFormat("#.##").format(this.getPerimeter()),
                new DecimalFormat("#.##").format(this.getArea())
        );
    }
}
