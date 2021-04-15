package chapter10.shapes;

public abstract class Shape {
    //CLASS MEMBERS
    private static int count = 0;
    
    //INSTANCE MEMBERS
    private int x;
    private int y;
    
    //CONSTRUCTORS
    public Shape(){
        this(0,0);
    }
    
    public Shape(int x, int y){
        this.setPosition(x,y);
        count++;
    }
    
    //ABSTRACT METHODS
    abstract void scale(float factor);
    abstract void grow(int d);
    abstract double getPerimeter();
    abstract double getArea();
    
    //STATIC METHODS
    public static int getCount() {
        return count;
    }
    
    //INSTANCE METHODS
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
    
    public void setPosition(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    
}
