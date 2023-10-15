public class Function {
    public static void main(String[] args) {
        hello(1);
        hello(2);
        hello(3);
    }

    static void hello(int num) {
        System.out.println("Hello, I received " + num);
    }
}
