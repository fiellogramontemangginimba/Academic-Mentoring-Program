public class Switch {
    public static void main(String[] args) {
        int num = 5;

        switch (num) {
            case 6:
                System.out.println("Num is equal to 6");
                break;
            case 5:
                System.out.println("Num is equal to 5");
                break;
            default:
                System.out.println("Num did not match any case");
                break;
        }
    }
}
