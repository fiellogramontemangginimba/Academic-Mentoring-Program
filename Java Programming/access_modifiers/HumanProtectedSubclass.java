package access_modifiers;

import access_modifiers.protect.HumanProtected;

public class HumanProtectedSubclass extends HumanProtected {
    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void tellAge() {
        System.out.println("My age is " + this.age);
    }
}
