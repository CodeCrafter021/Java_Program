import java.util.Scanner;

// Program to print a full centered star pyramid
// Example for rows=3:
//     *
//   * * *
// * * * * *
public class FullStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
