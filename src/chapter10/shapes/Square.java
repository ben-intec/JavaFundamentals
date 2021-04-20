package chapter10.shapes;

public class Square extends Rectangle {
    private static int count = 0;
    
    public Square() {
        this(1);
    }
    public Square(int side) {
        this(side, 0, 0);
    }
    public Square(Square square) {
        this(square.getSide(), square.getX(), square.getY());
    }
    public Square(int side, int x, int y) {
        super(side,side,x,y);
        count++;
    }

    public int getSide() {
        return getHeight();
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
    
    public static int getCount() {
        return count;
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }
    
    
    @Override
    public int hashCode() {
        return super.hashCode() + 311 * getSide();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square other = (Square) obj;
            return this.getSide() == other.getSide();
        }
        return false;
    }
    
}
