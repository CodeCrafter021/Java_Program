import java.util.Scanner;

public class NormalAndTraceOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int trace = 0;
        for (int i = 0; i < rows && i < cols; i++) {
            trace += matrix[i][i];
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Trace of matrix: " + trace);
        System.out.println("Sum of all elements: " + sum);

        sc.close();
    }
}
