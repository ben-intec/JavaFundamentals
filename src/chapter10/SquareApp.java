package chapter10;

public class SquareApp {


    public static void main(String[] args) {
        Square square = new Square(15);

        System.out.printf(
                "Square with width %d, height: %d,%nArea: %.2f, Perimeter: %.2f",
                square.getWidth(),
                square.getHeight(),
                square.getArea(),
                square.getPerimeter()
        );
    }

}
