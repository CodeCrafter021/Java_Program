import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter rotation positions: ");
        int rotate = sc.nextInt();

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + rotate) % n] = arr[i];
        }

        System.out.println("Rotated array:");
        for (int value : rotated) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
