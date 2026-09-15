import java.util.Scanner;

// Program to print a cross (X) pattern
public class CrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number for the size of the X: ");
        int size = sc.nextInt();
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print star on main diagonal or anti-diagonal
                if (i == j || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
