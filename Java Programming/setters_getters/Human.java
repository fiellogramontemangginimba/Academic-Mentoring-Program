package setters_getters;

public class Human {
    private int age;

    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        } else {
            System.out.println("Age must be greater than 0");
        }
    }

    public int getAge() {
        return this.age;
    }
}
