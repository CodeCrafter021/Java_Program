import java.util.Scanner;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean exists = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == result[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                result[index] = arr[i];
                index++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
