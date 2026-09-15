import java.util.Scanner;

// Program to calculate income tax based on income slabs
public class J02_CalculateIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income, tax = 0;

        System.out.print("Enter your income --> Rs.");
        income = sc.nextInt();

        // Tax calculation based on income slabs
        if (income <= 250000) {
            tax = 0; // No tax
        } else if (income <= 500000) {
            tax = (int)((income - 250000) * 0.05); // 5% on amount above 2.5L
        } else if (income <= 1000000) {
            tax = (int)(12500 + (income - 500000) * 0.20); // 20% on amount above 5L
        } else {
            tax = (int)(112500 + (income - 1000000) * 0.30); // 30% on amount above 10L
        }

        System.out.println("Taxable income --> Rs." + income);
        System.out.println("Income tax --> Rs." + tax);
        System.out.println("Net income --> Rs." + (income - tax));
    }
}
