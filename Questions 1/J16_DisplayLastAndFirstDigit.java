import java.util.Scanner;

// Program to display first and last digit of a 5-digit number
public class J16_DisplayLastAndFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five digit number => ");
        int n = sc.nextInt();

        if (n < 10000 || n > 99999) {
            System.out.println("Please enter a valid five digit number.");
            return;
        }

        int last = n % 10; // Last digit is remainder when divided by 10
        int temp = n;
        while (temp >= 10) {
            temp = temp / 10; // Keep dividing until one digit remains
        }
        int first = temp;

        System.out.println("First digit => " + first);
        System.out.println("Last digit => " + last);
    }
}
