import java.util.Scanner;

public class AddTwoComplexNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();

        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = scanner.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();

        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = scanner.nextDouble();

        // Add real and imaginary parts separately
        double realSum = real1 + real2;
        double imagSum = imag1 + imag2;

        System.out.println("Sum = " + realSum + " + " + imagSum + "i");

        scanner.close();
    }
}
