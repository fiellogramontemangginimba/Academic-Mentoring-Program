package access_modifiers;

public class Protected {
    public static void main(String[] args) {
        HumanProtectedSubclass claire = new HumanProtectedSubclass();

        claire.setAge(21);
        claire.tellAge();

        HumanProtectedSubclass john = new HumanProtectedSubclass();

        john.setAge(15);
        john.tellAge();
    }
}
