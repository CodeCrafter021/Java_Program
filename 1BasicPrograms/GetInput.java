import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        // Scanner is used to read input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
