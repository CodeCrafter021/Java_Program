import java.util.Scanner;
import java.util.Stack;

// Program to convert Decimal number to Binary using Stack
// Algorithm: Divide by 2, push remainders, then pop them all
public class DecimalToBinaryUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        
        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }
        
        Stack<Integer> stack = new Stack<>();
        int temp = num;
        
        // Keep dividing by 2 and push remainder
        while (temp > 0) {
            stack.push(temp % 2); // Remainder is 0 or 1
            temp = temp / 2;
        }
        
        // Pop all values - they come out in correct binary order
        System.out.print("Binary: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
