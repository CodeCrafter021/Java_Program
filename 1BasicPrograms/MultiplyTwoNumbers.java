import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        // Create Scanner to take input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        // Multiply numbers
        double product = first * second;

        System.out.println("Product: " + product);

        scanner.close();
    }
}
