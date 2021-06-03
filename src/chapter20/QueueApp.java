package chapter20;

import java.util.*;

public class QueueApp {

    public static void main(String[] args) {
//        Queue<BurgerOrder> burgerOrderQueue = new LinkedList<>();
        Queue<BurgerOrder> burgerOrderQueue = new PriorityQueue<>();
        burgerOrderQueue.offer(new BurgerOrder("John", 1));
        burgerOrderQueue.offer(new BurgerOrder("James", 2));
        burgerOrderQueue.offer(new BurgerOrder("Jack", 3));
        burgerOrderQueue.offer(new BurgerOrder("Jason", 4));

        burgerOrderQueue.forEach(b -> System.out.printf("Preparing order nr. %d for %s%n", b.getNumber(), b.getName()));
    }
}
