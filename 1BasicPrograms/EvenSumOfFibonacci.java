import java.util.Scanner;

public class EvenSumOfFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;
        int sum = 0;

        // Print Fibonacci numbers and add even ones
        System.out.print("Fibonacci sequence up to " + n + ": ");
        while (first <= n) {
            System.out.print(first + " ");
            if (first % 2 == 0) {
                sum += first;
            }
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        System.out.println("Sum of even Fibonacci numbers: " + sum);

        scanner.close();
    }
}
