import java.util.Scanner;

// Journal Question 3: Linear Search and Binary Search on an Array
public class JQ3_LinearAndBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array => ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.print("Enter " + num + " elements: ");
        for (int i = 0; i < num; i++) arr[i] = sc.nextInt();

        System.out.print("Which number to find? => ");
        int key = sc.nextInt();

        // --- Linear Search: Check each element one by one ---
        System.out.println("\n--- Linear Search Result ---");
        boolean found = false;
        for (int i = 0; i < num; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at position " + (i + 1) + " (index " + i + ")!");
                found = true; break;
            }
        }
        if (!found) System.out.println("Element NOT found in Array!");

        // --- Binary Search: Divide and conquer (array must be sorted) ---
        System.out.println("\n--- Binary Search Result ---");
        found = false;
        int low = 0, high = num - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element " + key + " found at position " + (mid + 1) + " (index " + mid + ")");
                found = true; break;
            } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        if (!found) System.out.println("Element NOT found in Array!");
    }
}
