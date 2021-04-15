package chapter10.animals;

public class Snake extends Animal{
    
    public Snake() {
    }
    
    public Snake(String name) {
        super(name);
    }
    
    @Override
    public void move() {
        System.out.println("Slither");
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Hiss");
    }
}
