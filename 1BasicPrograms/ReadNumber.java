import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        // Create Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("You entered: " + number);

        scanner.close();
    }
}
