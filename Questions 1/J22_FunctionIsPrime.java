import java.util.Scanner;

// Program to check prime using a method
public class J22_FunctionIsPrime {

    // Returns 0 if prime, 1 if not prime, -1 if invalid
    static int isPrime(int n) {
        if (n <= 1) return -1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return 1; // Not prime
        }
        return 0; // Prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int n = sc.nextInt();

        if (isPrime(n) == 0) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is not a Prime number.");
        }
    }
}
