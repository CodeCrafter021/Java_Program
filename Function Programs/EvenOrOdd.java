import java.util.Scanner;

// Program to check if a number is even or odd using a method
public class EvenOrOdd {
    
    // Method to check and print even or odd
    static void checkEvenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is even or odd: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }
    }
    
    public static void main(String[] args) {
        checkEvenOdd();
    }
}
