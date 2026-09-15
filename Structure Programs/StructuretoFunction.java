import java.util.Scanner;

// Program showing how to pass an object (like struct) to a method
public class StructuretoFunction {
    
    // Point class (like struct Point in C)
    static class Point {
        int x;
        int y;
    }
    
    // Method that takes a Point object and displays its coordinates
    static void displayPoint(Point p) {
        System.out.println("The coordinates are: (" + p.x + ", " + p.y + ")");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        
        System.out.print("Enter the X coordinate: ");
        p1.x = sc.nextInt();
        
        System.out.print("Enter the Y coordinate: ");
        p1.y = sc.nextInt();
        
        System.out.println();
        displayPoint(p1); // Pass object to method
    }
}
