package access_modifiers;

import access_modifiers.default_mod.HumanDefault;

public class HumanDefaultSubclass extends HumanDefault {
    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void tellAge() {
        System.out.println("My age is " + this.age);
    }
}
