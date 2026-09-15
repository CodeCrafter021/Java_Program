import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();

        // Perimeter = 2 * (length + breadth)
        double perimeter = 2 * (length + breadth);

        System.out.println("Perimeter of rectangle: " + perimeter);

        scanner.close();
    }
}
