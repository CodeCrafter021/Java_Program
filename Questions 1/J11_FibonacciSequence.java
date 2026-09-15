import java.util.Scanner;

// Program to print Fibonacci sequence up to n terms
// Fibonacci: each number = sum of previous two (0, 1, 1, 2, 3, 5, 8, ...)
public class J11_FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms => ");
        int n = sc.nextInt();

        long fib1 = 0, fib2 = 1, fib3;

        System.out.print("Fibonacci sequence up to " + n + " terms => ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fib1 + " ");
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        System.out.println();
    }
}
