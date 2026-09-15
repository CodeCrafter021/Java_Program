import java.util.Scanner;

// Program to calculate sum of all digits of a number
// Example: 1234 => 1+2+3+4 = 10
public class J15_DisplaySumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int n = sc.nextInt();

        if (n < 0) n = -n; // Handle negative numbers

        int sum = 0;
        while (n > 0) {
            int digit = n % 10; // Get last digit
            sum = sum + digit;
            n /= 10;
        }

        System.out.println("Sum of digits => " + sum);
    }
}
