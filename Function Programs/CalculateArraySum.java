import java.util.Scanner;

// Program to calculate sum of array elements using a method
public class CalculateArraySum {
    
    // Method that takes an array and returns its sum
    static int calculateArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers, pressing Enter after each:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int total = calculateArraySum(numbers);
        System.out.println("The total sum of the numbers is: " + total);
    }
}
