import java.util.Scanner;
import java.util.Stack;

// Journal Question 10: Convert Decimal to Binary using Stack
public class JQ10_DecimalToBinaryUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        if (num == 0) { System.out.println("Binary: 0"); return; }

        Stack<Integer> stack = new Stack<>();
        int temp = num;

        // Push remainders when dividing by 2
        while (temp > 0) { stack.push(temp % 2); temp /= 2; }

        // Pop gives binary in correct order
        System.out.print("Binary: ");
        while (!stack.isEmpty()) System.out.print(stack.pop());
        System.out.println();
    }
}
