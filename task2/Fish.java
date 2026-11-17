package task2;

public class Fish extends Animal {
    private String waterType;

    public Fish() {
        super();
        this.waterType = "fresh";
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, String waterType) {
        super(name);
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (fish) eats plankton.");
    }

    @Override
    public String getVoice() {
        return "...blub blub (fish are silent)";
    }

    public void swim() {
        System.out.println(getName() + " swims in " + waterType + " water.");
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public String toString() {
        return "Fish[" + super.toString() + ", waterType=" + waterType + "]";
    }
}