import java.util.Scanner;

// Program to print Floyd's Triangle
// Example for rows=3:
// 1
// 2 3
// 4 5 6
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        int number = 1; // Starting number (keeps increasing)
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increase the number
            }
            System.out.println();
        }
    }
}
