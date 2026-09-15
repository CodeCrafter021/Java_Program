import java.util.Scanner;

// Program to calculate factorial using a loop
public class J03_DisplayFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number --> ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial not defined for negative number.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + num + " => " + factorial);
        }
    }
}
