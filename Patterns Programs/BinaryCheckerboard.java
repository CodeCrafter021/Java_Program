import java.util.Scanner;

// Program to print a binary checkerboard pattern (0s and 1s)
// Example for size=4:
// 1 0 1 0
// 0 1 0 1
// 1 0 1 0
// 0 1 0 1
public class BinaryCheckerboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the checkerboard: ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                // If sum of row and column is even, print 1, else print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
