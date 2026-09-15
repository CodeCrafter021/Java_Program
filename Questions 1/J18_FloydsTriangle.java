// Program to print Floyd's Triangle (5 rows)
// Output:
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
public class J18_FloydsTriangle {
    public static void main(String[] args) {
        int num = 1;
        System.out.println("Floyd's Triangle =>");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
