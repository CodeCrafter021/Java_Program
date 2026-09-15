import java.util.Scanner;

// Program to find all prime factors of a number
// Example: 12 = 2 x 2 x 3
public class J14_CalculatePrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int n = sc.nextInt();

        System.out.print("Prime factors of " + n + " are => ");

        // Divide by 2 first (handles all even factors)
        while (n % 2 == 0) {
            System.out.print("2 ");
            n = n / 2;
        }

        // Check odd factors from 3 onwards
        for (int i = 3; i * i <= n; i = i + 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If n is still > 1, it itself is a prime factor
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}
