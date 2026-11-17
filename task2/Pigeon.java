package task2;

public class Pigeon extends Bird implements AnimalBehavior {
    private String species;

    public Pigeon() {
        super();
        this.species = "rock pigeon";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "grey");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (pigeon) eats breadcrumbs and grain.");
    }

    @Override
    public String getVoice() {
        return "Coo coo!";
    }

    public void deliverMessage() {
        System.out.println(getName() + " delivers a message.");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps on a roof with its head under its wing.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon fly");
    }

    @Override
    public String toString() {
        return "Pigeon[" + super.toString() + ", species=" + species + "]";
    }
}