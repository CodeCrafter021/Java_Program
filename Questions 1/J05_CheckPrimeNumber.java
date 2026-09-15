import java.util.Scanner;

// Program to check if a number is prime or not
// Prime number: divisible only by 1 and itself
public class J05_CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number --> ");
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean prime = true;
        // Check divisibility up to square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
