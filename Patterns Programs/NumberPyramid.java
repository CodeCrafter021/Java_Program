import java.util.Scanner;

// Program to print a number pyramid
// Example for rows=3:
// 1
// 1 2
// 1 2 3
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print column number
            }
            System.out.println();
        }
    }
}
