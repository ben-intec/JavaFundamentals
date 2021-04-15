package chapter10.animals;

public class Cat extends Animal{
    
    public Cat() {
    }
    
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void move() {
        System.out.println("Pounce");
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
