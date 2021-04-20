package chapter10.shapes;

import java.text.DecimalFormat;

public class IsoscelesTriangle extends Triangle{
    
    //STATIC VARIABLES
    private static int count = 0;
    
    //CONSTRUCTORS
    public IsoscelesTriangle() {
        this(2,3);
    }
    
    public IsoscelesTriangle(IsoscelesTriangle triangle) {
        this(triangle.getWidth(), triangle.getHeight(), triangle.getX(), triangle.getY());
    }
    
    public IsoscelesTriangle(int width, int height) {
        this(width, height, 0,0);
    }
    
    public IsoscelesTriangle(int width, int height, int x, int y) {
        super(width, height, width/2, x, y);
        count++;
    }
    
    //STATIC METHODS
    public static int getCount() {
        return count;
    }
    
    //OVERRIDES
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setPerpendicular(width/2);
    }
    
    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
        super.setWidth(perpendicular * 2);
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
}
