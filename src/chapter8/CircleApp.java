package chapter8;

import chapter10.shapes.Circle;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(34);
        System.out.println(circle1);

        System.out.println();
        Circle circle2 = new Circle(355,128,356);
        System.out.println(circle2);

    }
}
