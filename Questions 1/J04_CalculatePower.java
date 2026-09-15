import java.util.Scanner;

// Program to calculate power (base ^ exponent)
public class J04_CalculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base --> ");
        double a = sc.nextDouble();
        System.out.print("Enter an exponent --> ");
        double b = sc.nextDouble();

        double result = Math.pow(a, b); // Math.pow() is like pow() in C
        System.out.printf("%.2f ^ %.2f => %.2f%n", a, b, result);
    }
}
