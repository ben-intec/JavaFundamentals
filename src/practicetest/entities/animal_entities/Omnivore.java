package practicetest.entities.animal_entities;

import practicetest.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal{

    private Set<Plant> plantDiet;
    private double maxFoodSize;


    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        if(plantDiet == null)
            plantDiet = new HashSet<>();

        plantDiet.add(plant);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Omnivore[" +
                "name='" + name + '\'' +
                (weight != 0 ?", weight=" + weight : "") +
                (height != 0 ?", height=" + height : "") +
                (length != 0 ?", length=" + length : "") +
                ", maxFoodSize=" + maxFoodSize +
                ", plantDiet=" + plantDiet +
                ']';
    }
}
