import java.util.Scanner;

// Program to calculate factorial using a method (with a loop)
public class J21_FunctionFactorial {

    static long factorial(int n) {
        if (n < 0) return -1; // Invalid input
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number => ");
        int n = sc.nextInt();

        long result = factorial(n);
        if (result == -1) {
            System.out.println("Factorial not defined for negative number.");
        } else {
            System.out.println("Factorial of " + n + " => " + result);
        }
    }
}
