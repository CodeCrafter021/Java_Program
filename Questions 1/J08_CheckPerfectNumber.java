import java.util.Scanner;

// Program to check if a number is a perfect number
// Perfect number: sum of its divisors (excluding itself) equals the number (e.g., 6 = 1+2+3)
public class J08_CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int n = sc.nextInt();
        int sum = 0;

        // Add all divisors except the number itself
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is NOT a perfect number.");
        }
    }
}
