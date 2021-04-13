package chapter10;

import chapter8.Rectangle;


public class Square extends Rectangle {
    private int side;

    public Square() {
        this(1);
    }
    public Square(int side) {
        this(side, 0, 0);
    }

    public Square(Square square) {
        super(square);
        this.side = square.side;
    }

    public Square(int side, int x, int y) {
        super(side, side, x, y);
        this.side = side;
    }
}
