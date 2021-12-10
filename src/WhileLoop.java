import java.util.Scanner;

public class WhileLoop {
    private static final String ACTUAL_PASSWORD = "qwerty1";

    public static void main(String[] args) {
        // While loops are good to use when we don't know exact number of iterations in advance
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password: ");
        String password = sc.next();

        while (!password.equals(ACTUAL_PASSWORD)) {
            System.out.println("Enter password: ");
            password = sc.next();
        }
    }
}
