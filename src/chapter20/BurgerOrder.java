package chapter20;

import org.jetbrains.annotations.NotNull;

public class BurgerOrder implements  Comparable<BurgerOrder>{
    private String name;
    private int number;

    public BurgerOrder(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(@NotNull BurgerOrder other) {
        return this.number - other.number;
    }
}
