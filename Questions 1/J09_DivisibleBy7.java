// Program to print all numbers between 1 and 100 that are divisible by 7
public class J09_DivisibleBy7 {
    public static void main(String[] args) {
        System.out.print("Numbers between 1 and 100 divisible by 7 => ");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}
