// Program to print a heart pattern using stars
// This is a fixed-size heart design
public class HeartPattern {
    public static void main(String[] args) {
        // Top two humps of the heart
        for (int row = 0; row <= 2; row++) {
            for (int col = 1; col <= 17; col++) {
                if ((col >= 3 - row && col <= 6 + row) ||
                    (col >= 12 - row && col <= 15 + row)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // Bottom triangle of the heart
        for (int row = 0; row < 9; row++) {
            for (int col = 1; col <= 17; col++) {
                if (col >= row + 1 && col <= 17 - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
