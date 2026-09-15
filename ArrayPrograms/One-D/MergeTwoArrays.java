import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] first = new int[n1];
        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            first[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] second = new int[n2];
        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            second[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = first[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = second[i];
        }

        System.out.println("Merged array:");
        for (int value : merged) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
