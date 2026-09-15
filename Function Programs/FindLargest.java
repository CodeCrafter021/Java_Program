import java.util.Scanner;

// Program to find the largest of two numbers using a method
public class FindLargest {
    
    // Method that compares two numbers and returns the larger one
    static int findLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int largest = findLargest(num1, num2);
        System.out.println("The largest number is: " + largest);
    }
}
