public class Recursion {
    public static void main(String[] args) {
        hello(3);
    }

    static void hello(int num) {
        if (num < 0) {
            return;
        }

        System.out.println("Hello, I received " + num);
        num--;

        hello(num);
    }
}
