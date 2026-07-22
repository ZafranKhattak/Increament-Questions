package PreIncrement.Question3;

public class Main {
    public static void main(String[] args) {
        int a = 2;

        int b = a++ + a++ + ++a;

        System.out.println(a);
        System.out.println(b);
    }
}
