import java.util.Scanner;

// Program to find which digits (0-9) are absent in a given number
public class J10_AbsentDigitUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int n = sc.nextInt();

        // Array to track which digits are present (index 0-9)
        int[] present = new int[10];

        // Mark each digit of the number as present
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            present[digit] = 1;
            temp /= 10;
        }

        // Print digits that are NOT present
        System.out.print("Absent digits are => ");
        for (int i = 0; i < 10; i++) {
            if (present[i] == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}
