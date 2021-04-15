package chapter10;

import chapter10.shapes.*;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;

public class ShapeApp {
    
    public static void main(String[] args) {
        int length = 10;
        Rectangle[] rectangles = new Rectangle[length];
        Square[] squares = new Square[length];
        Circle[] circles = new Circle[length];
        Triangle[] triangles = new Triangle[length];
        IsoscelesTriangle[] iTriangles = new IsoscelesTriangle[length];
        for (int i = 0; i < length; i++) {
            rectangles[i] = new Rectangle((i + 1) * 3, (i + 1) * 5);
            squares[i] = new Square((i + 1) * 4);
            circles[i] = new Circle((int) ((i + 1) * Math.PI));
            triangles[i] = new Triangle((i + 1), (i + 1) * 3, (i + 3) * 3);
            iTriangles[i] = new IsoscelesTriangle((i + 1) * 3, (i + 3) * 3);
        }
        
        Shape[][] all = { rectangles, squares, circles, triangles, iTriangles };
    
        for (Shape[] shapes : all) {
            System.out.println(getRandomShape(shapes));
        }
    }
    
    public static Shape getRandomShape(Shape[] shapes) {
        return shapes[ThreadLocalRandom.current().nextInt(shapes.length)];
    }
    
}
