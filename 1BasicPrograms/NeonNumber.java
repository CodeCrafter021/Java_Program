import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;
        int sum = 0;

        // Add digits of square
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }

        scanner.close();
    }
}
