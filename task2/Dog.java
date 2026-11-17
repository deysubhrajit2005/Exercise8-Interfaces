package task2;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog() {
        super();
        this.breed = "mixed";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, "unknown");
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (dog) eats dog food and bones.");
    }

    @Override
    public String getVoice() {
        return "Woof woof!";
    }

    public void fetch() {
        System.out.println(getName() + " fetches the ball.");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps in its dog bed.");
    }

    @Override
    public void move() {
        System.out.println("Dog run");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + ", breed=" + breed + "]";
    }
}