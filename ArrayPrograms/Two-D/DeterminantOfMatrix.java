import java.util.Scanner;

public class DeterminantOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int determinant = determinant(matrix, n);
        System.out.println("Determinant of matrix: " + determinant);

        sc.close();
    }

    public static int determinant(int[][] matrix, int n) {
        if (n == 1) {
            return matrix[0][0];
        }

        if (n == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }

        int det = 0;
        for (int col = 0; col < n; col++) {
            int[][] minor = new int[n - 1][n - 1];
            int r = 0;
            for (int i = 1; i < n; i++) {
                int c = 0;
                for (int j = 0; j < n; j++) {
                    if (j != col) {
                        minor[r][c] = matrix[i][j];
                        c++;
                    }
                }
                r++;
            }
            det += (col % 2 == 0 ? 1 : -1) * matrix[0][col] * determinant(minor, n - 1);
        }
        return det;
    }
}
