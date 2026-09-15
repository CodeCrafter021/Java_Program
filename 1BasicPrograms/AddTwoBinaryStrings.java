import java.util.Scanner;

public class AddTwoBinaryStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String binary1 = scanner.next();

        System.out.print("Enter second binary number: ");
        String binary2 = scanner.next();

        // Convert binary strings to integers and add them
        int number1 = Integer.parseInt(binary1, 2);
        int number2 = Integer.parseInt(binary2, 2);

        int sum = number1 + number2;

        // Convert result back to binary string
        String result = Integer.toBinaryString(sum);

        System.out.println("Sum in binary: " + result);

        scanner.close();
    }
}
