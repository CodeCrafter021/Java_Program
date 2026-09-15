import java.util.Scanner;

// Program to calculate Square, Cube, or Square Root using methods
public class J26_FunctionSquareCubeSquareroot {

    static double square(double a)     { return a * a; }
    static double cube(double a)       { return a * a * a; }
    static double squareRoot(double a) { return Math.sqrt(a); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter a number => ");
        double number = sc.nextDouble();

        System.out.println("\nSelect operation:");
        System.out.println("1. Square");
        System.out.println("2. Cube");
        System.out.println("3. Square Root");
        System.out.print("Enter your choice (1 to 3) => ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.printf("Square of %.2f => %.2f%n", number, square(number));
                break;
            case 2:
                System.out.printf("Cube of %.2f => %.2f%n", number, cube(number));
                break;
            case 3:
                if (number < 0) System.out.println("Cannot calculate square root of negative number.");
                else System.out.printf("Square root of %.2f => %.2f%n", number, squareRoot(number));
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
}
