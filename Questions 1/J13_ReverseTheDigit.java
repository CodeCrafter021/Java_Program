import java.util.Scanner;

// Program to reverse the digits of an integer
// Example: 12345 => 54321
public class J13_ReverseTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer => ");
        int n = sc.nextInt();

        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;           // Get last digit
            reversed = reversed * 10 + digit; // Add digit to reversed
            n /= 10;                      // Remove last digit
        }

        System.out.println("Reversed number => " + reversed);
    }
}
