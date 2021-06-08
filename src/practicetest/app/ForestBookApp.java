package practicetest.app;

import practicetest.entities.animal_entities.*;
import practicetest.entities.plant_entities.*;
import practicetest.service.ForestNotebook;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForestBookApp {

    public static void main(String[] args) {
        ForestNotebook notebook = new ForestNotebook();

        Tree acacia = new Tree("Acacia", 3.5);
        Tree bonsai = new Tree("Bonsai", 0.21);
        Flower daisy = new Flower("Daisy", 0.08);
        Weed nettle = new Weed("Nettle", 1.56);
        Bush oleander = new Bush("Oleander", 1.8);

        acacia.setLeafType(LeafType.SPEAR);
        bonsai.setLeafType(LeafType.HEART);
        oleander.setLeafType(LeafType.SPEAR);
        oleander.setFruit("capsule");
        daisy.setSmell(Scent.SWEET);
        nettle.setArea(34);

        System.out.println("Plants");
        List<Plant> plants = Stream
                .of(acacia, bonsai, daisy, nettle, oleander)
                .collect(Collectors.toList());

        plants.forEach(System.out::println);
        plants.forEach(notebook::addPlant);

        Herbivore cow = new Herbivore("Cow", 1270, 1.7, 2.45);
        Herbivore giraffe = new Herbivore("Giraffe", 1000, 5.6, 2.5);
        Herbivore moose = new Herbivore("Moose", 650, 2.98, 2.01);
        Omnivore boar = new Omnivore("Boar", 99, 0.88, 1.71);
        Omnivore grizzly = new Omnivore("Grizzly", 363, 2.44, 1.37);
        Omnivore turtle = new Omnivore("Turtle", 205, 0.9, 1.47);
        Carnivore tiger = new Carnivore("Tiger", 250, 1.14, 1.87);
        Carnivore anteater = new Carnivore("Anteater", 47, 1, 1.8);
        Carnivore penguin = new Carnivore("Penguin", 43, 1.3, 1.3);

        cow.setPlantDiet(Set.of(nettle, daisy));
        giraffe.setPlantDiet(Set.of(acacia, bonsai));
        moose.setPlantDiet(Set.of(nettle, daisy, bonsai));

        turtle.setPlantDiet(Set.of(nettle, daisy));
        grizzly.setPlantDiet(Set.of(acacia, bonsai));
        boar.setPlantDiet(Set.of(nettle, daisy, bonsai));
        turtle.setMaxFoodSize(0.4);
        grizzly.setMaxFoodSize(1.2);
        boar.setMaxFoodSize(0.8);

        tiger.setMaxFoodSize(2.0);
        anteater.setMaxFoodSize(0.06);
        penguin.setMaxFoodSize(0.2);

        System.out.println();
        System.out.println("Animals");
        List<Animal> animals = Stream
                .of(cow, giraffe, moose, boar, grizzly, turtle, tiger, anteater, penguin)
                .collect(Collectors.toList());
        animals.forEach(System.out::println);
        animals.forEach(notebook::addAnimal);

        System.out.println();
        notebook.printNotebook();

        System.out.println();
        System.out.println(notebook.getCarnivores());
        System.out.println(notebook.getHerbivores());
        System.out.println(notebook.getOmnivores());

        System.out.println();
        System.out.println("Sorted by name");
        notebook.sortAnimalsByName();
        notebook.sortPlantsByName();
        notebook.printNotebook();

        System.out.println();
        System.out.println("Sorted by height");
        notebook.sortAnimalsByHeight();
        notebook.sortPlantsByHeight();
        notebook.printNotebook();

    }
}
