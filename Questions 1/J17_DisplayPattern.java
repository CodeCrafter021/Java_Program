// Program to display a number pattern
// Output:
// 1111111
//  222222
//   33333
//    4444
//     555
//      66
public class J17_DisplayPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            // Print leading spaces
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            // Print the digit (7-i) times
            for (int j = 1; j <= (7 - i); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
