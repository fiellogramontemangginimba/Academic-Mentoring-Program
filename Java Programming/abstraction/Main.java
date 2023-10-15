package abstraction;

public class Main {
    public static void main(String[] args) {
        Dog anny = new Dog();

        anny.weight = 2.5;
        anny.height = 20.3;
        anny.ownerName = "John";

        anny.makeNoise();
        System.out.println("Anny's weight is " + anny.weight);
        System.out.println("Anny's height is " + anny.height);
        System.out.println("Anny's owner is " + anny.ownerName);
    }
}
