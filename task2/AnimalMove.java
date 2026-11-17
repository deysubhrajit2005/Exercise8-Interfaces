package task2;

public interface AnimalMove {
    default void move() {
        System.out.println(getClass().getSimpleName() + " moves (general animal movement).");
    }
}