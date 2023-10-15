package person;

public class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("Hello, I am " + name + " " + age + " Years old.");
    }

    void count(int num) throws Exception {
        if (num < 1) {
            throw new Exception("Cant count to negative.");
        }

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
