import java.util.Scanner;

// Program to find the largest and second largest number in an array
public class J29_LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements => ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + " => ");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0], secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("\nLargest        => " + largest);
        System.out.println("Second Largest => " + secondLargest);
    }
}
