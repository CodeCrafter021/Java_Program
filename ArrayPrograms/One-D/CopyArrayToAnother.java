import java.util.Scanner;

public class CopyArrayToAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] source = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            source[i] = sc.nextInt();
        }

        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = source[i];
        }

        System.out.println("Copied array:");
        for (int value : copy) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
