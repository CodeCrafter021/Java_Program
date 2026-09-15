import java.util.Scanner;

// Program to swap two numbers using a method (simulating C pointer swap)
// Java passes primitives by value, so we use an int array to simulate pass-by-reference
public class J35_SwapNumberUsingReference {

    // Swap two numbers using array (index 0 and 1)
    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number => ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number => ");
        int num2 = sc.nextInt();

        int[] nums = {num1, num2};

        System.out.println("\nBefore Swap =>\na: " + nums[0] + "\nb: " + nums[1]);
        swap(nums);
        System.out.println("\nAfter Swap =>\na: " + nums[0] + "\nb: " + nums[1]);
    }
}
