package practicetest.entities.plant_entities;

public class Plant {

    protected String name;
    protected double height;

    public Plant(String name) {
        this(name, 0);
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Plant) {
            return this.name.equals(((Plant)obj).name);
        }
        return false;
    }
}
