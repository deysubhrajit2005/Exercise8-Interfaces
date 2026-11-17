package task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        // different constructors
        animals[0] = new Mammal("Cow", 5, 600.0, "black and white");      // all parameters
        animals[1] = new Dog("Rex", "German Shepherd");                   // some parameters
        animals[2] = new Bird();                                           // default
        animals[3] = new Pigeon("Gary", 2, 0.35, "grey", "homing pigeon"); // all parameters
        animals[4] = new Fish("Nemo", "salt");                             // some parameters
        animals[5] = new Blowfish();                                       // default

        // setters on default objects
        animals[2].setName("Tweety");
        animals[5].setName("Puffy");
        animals[5].setAge(3);

        // common methods on every index
        for (int i = 0; i < animals.length; i++) {
            System.out.println("[" + i + "] " + animals[i]);
            animals[i].eat();
            System.out.println("    voice: " + animals[i].getVoice());
            System.out.println();
        }

        // own methods on selected indexes
        ((Mammal) animals[0]).feedYoung();
        ((Dog) animals[1]).fetch();
        ((Bird) animals[2]).fly();
        ((Pigeon) animals[3]).deliverMessage();
        ((Fish) animals[4]).swim();
        ((Blowfish) animals[5]).inflate();

        // ===== Exercise 8: interfaces =====

        // 1) AnimalBehavior array - only Dog, Pigeon, Blowfish
        System.out.println();
        System.out.println("=== AnimalBehavior: sleep() ===");
        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = new Dog("Rex", "German Shepherd");
        behaviors[1] = new Pigeon("Gary", 2, 0.35, "grey", "homing pigeon");
        behaviors[2] = new Blowfish("Puffy", true);
        behaviors[0].sleep();
        behaviors[1].sleep();
        behaviors[2].sleep();

        // 2) AnimalMove - foreach on the Animal array
        System.out.println();
        System.out.println("=== AnimalMove: move() ===");
        for (Animal a : animals) {
            a.move();
        }

        // 3) AnimalName - static method called on the interface
        System.out.println();
        System.out.println("=== AnimalName: name() ===");
        for (Animal a : animals) {
            AnimalName.name(a.getName());
        }
    }
}