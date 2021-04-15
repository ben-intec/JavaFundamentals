package chapter10.animals;

public abstract class Animal {
    
    private String name;
    
    abstract void move();
    abstract void makeNoise();
    
    public Animal() {
        this("Anonymous");
    }
    
    public Animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
