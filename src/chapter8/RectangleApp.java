package chapter8;

import chapter10.shapes.Rectangle;

import static chapter10.shapes.Rectangle.*;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");
//        Rectangle rec1 = new Rectangle();
//        rec1.width = 50;
//        rec1.height = 11;
//        rec1.x = 200;
//        rec1.y = 0;
        Rectangle rec1 = new Rectangle();
        rec1.setWidth(50);
        rec1.setHeight(11);
        rec1.setPosition(200, 0);

        printRectangle(rec1);
        System.out.println("\nGrow:");
        rec1.grow(7);
        printRectangle(rec1);

        Rectangle rec2 = new Rectangle();
        rec2.setWidth(38);
        rec2.setHeight(10);
        rec2.setPosition(200, 11);

        System.out.println();
        printRectangle(rec2);
        System.out.println("\nScale:");
        rec2.scale(0.8f);
        printRectangle(rec2);

        System.out.println();
        System.out.println("\nNegative H&W:");
        Rectangle rec3 = new Rectangle(-34,-99, 44,798);
        printRectangle(rec3);


        System.out.println();
        System.out.println("\nRectangle from rectangle:");
        Rectangle rec4 = new Rectangle(rec1);
        printRectangle(rec4);

        System.out.printf("%nNumber of angles = %d", ANGLES);
    }

    public static void printRectangle(Rectangle rectangle) {
        System.out.println(rectangle);
        System.out.printf("Created %d rectangle%s!%n", getCount(), getCount() > 1 ? "s":"");
    }
}
