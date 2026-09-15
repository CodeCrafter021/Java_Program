import java.util.Arrays;
import java.util.Scanner;

public class Sort2DArrayAcrossColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix before sorting each column:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int col = 0; col < cols; col++) {
            int[] columnValues = new int[rows];
            for (int row = 0; row < rows; row++) {
                columnValues[row] = matrix[row][col];
            }
            Arrays.sort(columnValues);

            for (int row = 0; row < rows; row++) {
                matrix[row][col] = columnValues[row];
            }
        }

        System.out.println("Matrix after sorting each column:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
