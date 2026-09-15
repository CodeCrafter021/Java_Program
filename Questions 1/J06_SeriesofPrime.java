import java.util.Scanner;

// Program to print all prime numbers between two given numbers
public class J06_SeriesofPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number => ");
        int start = sc.nextInt();
        System.out.print("Enter ending number => ");
        int end = sc.nextInt();

        System.out.print("Prime numbers between " + start + " and " + end + " => ");

        for (int i = start; i <= end; i++) {
            boolean prime = true;
            if (i <= 1) { prime = false; }
            else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) { prime = false; break; }
                }
            }
            if (prime) System.out.print(" " + i);
        }
        System.out.println();
    }
}
