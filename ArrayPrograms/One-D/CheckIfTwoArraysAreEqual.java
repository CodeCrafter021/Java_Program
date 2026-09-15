import java.util.Arrays;
import java.util.Scanner;

public class CheckIfTwoArraysAreEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        if (n1 != n2) {
            System.out.println("Arrays are not equal.");
        } else {
            boolean equal = Arrays.equals(a, b);
            if (equal) {
                System.out.println("Arrays are equal.");
            } else {
                System.out.println("Arrays are not equal.");
            }
        }

        sc.close();
    }
}
