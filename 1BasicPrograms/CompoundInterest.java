import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();

        // Compound interest formula: A = P * (1 + r/100)^t
        double amount = principal * Math.pow(1 + (rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();
    }
}
