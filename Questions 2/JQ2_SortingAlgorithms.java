import java.util.Scanner;

// Journal Question 2: Bubble Sort, Insertion Sort, Selection Sort
public class JQ2_SortingAlgorithms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array => ");
        int num = sc.nextInt();

        int[] originalArr = new int[num];
        int[] arr = new int[num];

        System.out.println("Enter " + num + " elements:");
        for (int i = 0; i < num; i++) {
            originalArr[i] = sc.nextInt();
            arr[i] = originalArr[i];
        }

        // --- Bubble Sort ---
        // Repeatedly swap adjacent elements if they are in wrong order
        for (int i = 0; i < num - 1; i++)
            for (int j = 0; j < num - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                }
        System.out.print("\nBubble Sort Array --> ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        // Reset array for next sort
        for (int i = 0; i < num; i++) arr[i] = originalArr[i];

        // --- Insertion Sort ---
        // Pick each element and place it in its correct position
        for (int i = 1; i < num; i++) {
            int temp = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > temp) { arr[j + 1] = arr[j]; j--; }
            arr[j + 1] = temp;
        }
        System.out.print("Insertion Sort Array --> ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        // Reset array for next sort
        for (int i = 0; i < num; i++) arr[i] = originalArr[i];

        // --- Selection Sort ---
        // Find minimum element and place it at front each time
        for (int i = 0; i < num - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < num; j++)
                if (arr[j] < arr[minIndex]) minIndex = j;
            if (minIndex != i) {
                int temp = arr[i]; arr[i] = arr[minIndex]; arr[minIndex] = temp;
            }
        }
        System.out.print("Selection Sort Array --> ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
}
