package practicetest.entities.animal_entities;

import practicetest.entities.plant_entities.Plant;

public class Animal {

    protected String name;
    protected double weight;
    protected double height;
    protected double length;

    public Animal(String name) {
        this(name, 0, 0, 0);
    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return this.name.equals(((Animal)obj).name);
        }
        return false;
    }
}
