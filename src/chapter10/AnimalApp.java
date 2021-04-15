package chapter10;

import chapter10.animals.*;

import java.util.concurrent.ThreadLocalRandom;

public class AnimalApp {
    
    public static void main(String[] args) {
        Animal[] animals = new Animal[25];
        for (int i = 0; i < animals.length; i++) {
            if(i%2 == 0) animals[i] = new Bird(getRandomName());
            if(i%3 == 0) animals[i] = new Cat(getRandomName());
            if(i%4 == 0) animals[i] = new Fish(getRandomName());
            if(i%5 == 0) animals[i] = new Snake(getRandomName());
        }
    
        for (Animal animal : animals) {
            if(animal instanceof Bird) {
                Bird bird = (Bird) animal;
                System.out.printf("%nBird named %s%n", bird.getName());
    
                bird.move();
                bird.makeNoise();
            }
            if(animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.printf("%nCat named %s%n", cat.getName());
                cat.move();
                cat.makeNoise();
            }
            if(animal instanceof Fish) {
                Fish fish = (Fish) animal;
                System.out.printf("%nFish named %s%n", fish.getName());
                fish.move();
                fish.makeNoise();
            }
            if(animal instanceof Snake) {
                Snake snake = (Snake) animal;
                System.out.printf("%nSnake named %s%n", snake.getName());
                snake.move();
                snake.makeNoise();
            }
        }
    }
    
    static String[] names = {
            "Petronille","Edus","Rose","Giles", "Rare", "Mariot", "Benedict",
            "Mabel", "Edward", "Lettice", "Luke", "Constance", "George", "Anne",
            "Gregory", "Idony", "Clement", "Elias", "Bartholomew", "Marion", "Martin",
            "Eleanor", "Jena", "Ibot", "Nigel", "Mag", "Randolph", "Evita", "Madok",
            "Clemence", "Maurice", "gatha", "Griffin", "Helwise", "Gervase", "Godelena",
            "Eyvyn", "Lora", "Hamond"
    };
    static String[] usedNames = new String[names.length];
    
    public static String getRandomName() {
        
        String name;
        boolean used = false;
        do {
            name = names[ThreadLocalRandom.current().nextInt(names.length)];
            for (int i = 0; i < usedNames.length; i++) {
                String usedName = usedNames[i];
                if (usedName != null && usedName.equals(name)) {
                    used = true;
                    break;
                } else if (usedName == null || usedName.isEmpty()){
                    usedNames[i] = name;
                    used = false;
                    break;
                }
            }
        } while (used);
        
        
        return name;
    }
    
}
