package implement;

public class Dog extends Animal implements LivingThing {
    String ownerName;

    public void eat() {
        System.out.println("Eats dog food.");
    }
}
