import java.util.Scanner;

// Program to check if a number is an Armstrong number
// Armstrong number: sum of cubes of digits equals the number (e.g., 153 = 1^3 + 5^3 + 3^3)
public class J07_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three digit number => ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit; // Add cube of each digit
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
