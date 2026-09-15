import java.util.Scanner;

// Program to calculate area of a rectangle using a method
public class CalculateArea {
    
    // Method to calculate and print the area
    static void calculateArea(float length, float width) {
        float area = length * width;
        System.out.printf("The area of the rectangle is: %.2f%n", area);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        float l = sc.nextFloat();
        
        System.out.print("Enter the width of the rectangle: ");
        float w = sc.nextFloat();
        
        calculateArea(l, w); // Call the method
    }
}
