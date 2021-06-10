package practicetest.service;

import practicetest.entities.animal_entities.*;
import practicetest.entities.plant_entities.Plant;

import java.util.*;
import java.util.stream.Collectors;

public class ForestNotebook {

    private int plantCount;
    private int animalCount;
    private List<Plant> plants;
    private List<Animal> animals;
    private List<Omnivore> omnivores;
    private List<Carnivore> carnivores;
    private List<Herbivore> herbivores;

    public ForestNotebook() {
        plants = new ArrayList<>();
        animals = new ArrayList<>();
        omnivores = new ArrayList<>();
        carnivores = new ArrayList<>();
        herbivores = new ArrayList<>();
    }

    public List<Carnivore> getCarnivores() {
        return carnivores.stream().distinct().collect(Collectors.toList());
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores.stream().distinct().collect(Collectors.toList());
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores.stream().distinct().collect(Collectors.toList());
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal) {
        if(animals.contains(animal)) return;

        if (animal instanceof Carnivore)
            carnivores.add((Carnivore) animal);
        if (animal instanceof Herbivore)
            herbivores.add((Herbivore) animal);
        if (animal instanceof Omnivore)
            omnivores.add((Omnivore) animal);

        animals.add(animal);
        animalCount++;
    }

    public void addPlant(Plant plant) {
        if (plants.contains(plant)) return;

        plants.add(plant);
        plantCount++;
    }

    public void printNotebook() {
        String animalsString = animals.stream()
                .map(animal -> String.format(
                        "%s: %s",
                        animal.getClass().getSimpleName(),
                        animal.getName()
                ))
                .reduce("", (a, b) -> a + ", " + b);

        String plantString = plants.stream()
                .map(plant -> String.format(
                        "%s: %s",
                        plant.getClass().getSimpleName(),
                        plant.getName()
                ))
                .reduce("", (a, b) -> a + ", " + b);

        System.out.println("Animals:");
        System.out.println(animalsString.substring(1));
        System.out.println("Plants:");
        System.out.println(plantString.substring(1));
    }

    public void sortAnimalsByName() {
        Collections.sort(animals, Comparator.comparing(Animal::getName));
    }

    public void sortPlantsByName() {
        Collections.sort(plants, Comparator.comparing(Plant::getName));
    }

    public void sortAnimalsByHeight() {
        Collections.sort(animals, Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight() {
        Collections.sort(plants, Comparator.comparing(Plant::getHeight));
    }
}
