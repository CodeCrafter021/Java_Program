import java.util.Scanner;

// Program to swap two numbers
// Note: In Java we cannot pass by reference like C pointers,
// so we use an array trick or just swap inside main
public class SwapNumbers {
    
    // Method that swaps two numbers using a temp variable (returns swapped pair)
    static int[] swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b}; // Return swapped values as array
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int[] result = swapNumbers(num1, num2);
        
        System.out.println("After swapping, the first number is: " + result[0]);
        System.out.println("After swapping, the second number is: " + result[1]);
    }
}
