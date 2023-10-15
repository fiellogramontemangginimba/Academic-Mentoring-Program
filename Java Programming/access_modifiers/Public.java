package access_modifiers;

public class Public {
    public static void main(String[] args) {
        Human claire = new Human();

        claire.age = 20;
        System.out.println("Claire's age is " + claire.age);
    }
}
