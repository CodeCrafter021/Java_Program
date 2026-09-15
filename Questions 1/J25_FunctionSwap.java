import java.util.Scanner;

// Program to swap two numbers using a method
// In Java we use an int array to simulate pass-by-reference (like C pointers)
public class J25_FunctionSwap {

    static void swap(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number => ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number => ");
        int num2 = sc.nextInt();

        int[] nums = {num1, num2};
        System.out.println("\nBefore Swap => a: " + nums[0] + " , b: " + nums[1]);
        swap(nums);
        System.out.println("After Swap  => a: " + nums[0] + " , b: " + nums[1]);
    }
}
