import java.util.Scanner;

// Program to perform matrix operations: display, transpose, diagonal, lower/upper triangular
public class J30_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("\nEnter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i+1) + "][" + (j+1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }

        // Display matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Transpose
        System.out.println("\nTranspose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) System.out.print(matrix[j][i] + " ");
            System.out.println();
        }

        // Diagonal (only for square matrix)
        if (rows == cols) {
            System.out.print("\nDiagonal Elements: ");
            for (int i = 0; i < rows; i++) System.out.print(matrix[i][i] + " ");
            System.out.println();
        }

        // Lower Triangular
        System.out.println("\nLower Triangular Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print((j <= i ? matrix[i][j] : 0) + " ");
            System.out.println();
        }

        // Upper Triangular
        System.out.println("\nUpper Triangular Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print((j >= i ? matrix[i][j] : 0) + " ");
            System.out.println();
        }
    }
}
