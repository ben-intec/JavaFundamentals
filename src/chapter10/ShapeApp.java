package chapter10;

import chapter10.shapes.*;

public class ShapeApp {

    public static void main(String[] args) {
        int length = 10;
        Rectangle[] rects = new Rectangle[length];
        Square[] squares = new Square[length];
        for (int i = 0; i < length; i++) {
            rects[i] = new Rectangle((i+1)*3,(i+1)*5);
            squares[i] = new Square((i+1)*4);
        }
    
//        System.out.println(Rectangle.getCount());
//        System.out.println(Shape.getCount());
//        System.out.println(Square.getCount());
        
        int testi = -15;
        int testo = 15;
        System.out.println(-testi + testo);
    }

}
