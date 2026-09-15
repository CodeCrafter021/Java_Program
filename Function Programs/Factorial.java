import java.util.Scanner;

// Program to find factorial of a number using recursion
public class Factorial {
    
    // Recursive method - calls itself to calculate factorial
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive number to find its factorial: ");
        int num = sc.nextInt();
        
        long result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }
}
