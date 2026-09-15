import java.util.Scanner;

// Program to convert decimal to Binary, Octal, or Hexadecimal using methods
public class J27_FunctionDecimalConversion {

    static void decimalToBinary(int n) {
        if (n == 0) { System.out.println("Binary => 0"); return; }
        int[] binary = new int[32];
        int i = 0;
        while (n > 0) { binary[i++] = n % 2; n /= 2; }
        System.out.print("Binary => ");
        for (int j = i - 1; j >= 0; j--) System.out.print(binary[j]);
        System.out.println();
    }

    static void decimalToOctal(int n) {
        System.out.println("Octal => " + Integer.toOctalString(n));
    }

    static void decimalToHex(int n) {
        System.out.println("Hexadecimal => " + Integer.toHexString(n).toUpperCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Decimal Conversion System ===");
        System.out.print("Enter a decimal number => ");
        int decimal = sc.nextInt();

        System.out.println("\nSelect Conversion =>\n1. Decimal to Binary\n2. Decimal to Octal\n3. Decimal to Hexadecimal");
        System.out.print("Enter a choice (1 to 3) => ");
        int choice = sc.nextInt();

        System.out.println("Decimal => " + decimal);
        switch (choice) {
            case 1: decimalToBinary(decimal); break;
            case 2: decimalToOctal(decimal); break;
            case 3: decimalToHex(decimal); break;
            default: System.out.println("Invalid choice!");
        }
    }
}
