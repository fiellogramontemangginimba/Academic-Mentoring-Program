package person;

public class Test {
    public static void main(String[] args) {
        final Person mark = new Person();
        mark.name = "Mark";
        mark.age = 20;

        System.out.println("mark.name = " + mark.name);
        System.out.println("mark.age = " + mark.age);

        mark.age = 21;
        System.out.println("mark.age = " + mark.age);

        mark.sayHello();
        try {
            mark.count(-1);
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}
