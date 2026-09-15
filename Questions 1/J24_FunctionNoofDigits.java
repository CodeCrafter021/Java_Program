import java.util.Scanner;

// Program to count number of digits in a number using a method
public class J24_FunctionNoofDigits {

    static int noOfDigits(int n) {
        if (n < 0) n = -n; // Handle negative numbers
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int n = sc.nextInt();
        System.out.println("Number of digits in " + n + " => " + noOfDigits(n));
    }
}
