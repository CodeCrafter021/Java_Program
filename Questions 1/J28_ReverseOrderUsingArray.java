import java.util.Scanner;

// Program to reverse an array and display both original and reversed
public class J28_ReverseOrderUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array => ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + " => ");
            arr1[i] = sc.nextInt();
        }

        // Fill arr2 in reverse order of arr1
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[n - 1 - i];
        }

        System.out.print("\nOriginal Array => ");
        for (int i = 0; i < n; i++) System.out.print(arr1[i] + " ");

        System.out.print("\nReversed Array => ");
        for (int i = 0; i < n; i++) System.out.print(arr2[i] + " ");
        System.out.println();
    }
}
