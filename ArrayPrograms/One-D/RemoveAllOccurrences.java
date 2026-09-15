import java.util.Scanner;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int key = sc.nextInt();

        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != key) {
                result[index] = arr[i];
                index++;
            }
        }

        System.out.println("Array after removing all occurrences:");
        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
