import java.util.Scanner;

// Program to calculate Simple Interest using a method
// SI Formula: (Principal * Rate * Time) / 100
public class J23_FunctionSimpleInterest {

    static float simpleInterest(float principal, int years, float rate) {
        return (principal * years * rate) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount => Rs. ");
        float principal = sc.nextFloat();
        System.out.print("Enter Rate of interest (% per annum) => ");
        float rate = sc.nextFloat();
        System.out.print("Enter Number of years => ");
        int years = sc.nextInt();

        float interest = simpleInterest(principal, years, rate);

        System.out.printf("Principal       => Rs. %.2f%n", principal);
        System.out.printf("Rate            => %.2f%% per annum%n", rate);
        System.out.println("Years           => " + years);
        System.out.printf("Simple Interest => Rs. %.2f%n", interest);
        System.out.printf("Total Amount    => Rs. %.2f%n", principal + interest);
    }
}
