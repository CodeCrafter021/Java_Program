import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int lcm = 0;
        int max = Math.max(a, b);

        // Find LCM by checking multiples of the larger number
        for (int i = max; ; i += max) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);

        scanner.close();
    }
}
