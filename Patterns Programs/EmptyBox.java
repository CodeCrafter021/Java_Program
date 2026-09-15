import java.util.Scanner;

// Program to print an empty box (star border)
// Example for size=4:
// * * * *
// *     *
// *     *
// * * * *
public class EmptyBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the box: ");
        int size = sc.nextInt();
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print star only on border rows and columns
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces inside
                }
            }
            System.out.println();
        }
    }
}
