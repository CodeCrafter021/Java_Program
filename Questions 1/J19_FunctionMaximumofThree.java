import java.util.Scanner;

// Program to find maximum of three numbers using a method
public class J19_FunctionMaximumofThree {

    static int maximumOfThree(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers =>");
        System.out.print("Number 1 => "); int x = sc.nextInt();
        System.out.print("Number 2 => "); int y = sc.nextInt();
        System.out.print("Number 3 => "); int z = sc.nextInt();

        int max = maximumOfThree(x, y, z);
        System.out.println("Maximum of " + x + ", " + y + ", " + z + " is => " + max);
    }
}
