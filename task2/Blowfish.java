package task2;

public class Blowfish extends Fish implements AnimalBehavior {
    private boolean poisonous;

    public Blowfish() {
        super();
        setWaterType("salt");
        this.poisonous = true;
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean poisonous) {
        super(name, age, weight, waterType);
        this.poisonous = poisonous;
    }

    public Blowfish(String name, boolean poisonous) {
        super(name, "salt");
        this.poisonous = poisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (blowfish) eats shellfish and algae.");
    }

    @Override
    public String getVoice() {
        return "Grrk! (grinds its teeth)";
    }

    public void inflate() {
        System.out.println(getName() + " inflates into a spiky ball!");
    }

    public boolean isPoisonous() { return poisonous; }
    public void setPoisonous(boolean poisonous) { this.poisonous = poisonous; }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps resting on the sea floor.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim");
    }

    @Override
    public String toString() {
        return "Blowfish[" + super.toString() + ", poisonous=" + poisonous + "]";
    }
}