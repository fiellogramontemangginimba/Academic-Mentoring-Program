package extend;

public class Main {
    public static void main(String[] args) {
        Dog butch = new Dog();

        butch.height = 30.15;
        butch.weight = 2.15;
        butch.ownerName = "Jake";

        butch.makeNoise();
        System.out.println("Butch's height is " + butch.height);
        System.out.println("Butch's weight is " + butch.weight);
        System.out.println("Butch's owner is " + butch.ownerName);
    }
}
