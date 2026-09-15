import java.util.Scanner;

// Program to convert a decimal number to binary, octal, and hexadecimal
public class J12_ConvertDecimalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number => ");
        int decimal = sc.nextInt();

        System.out.println("Decimal     => " + decimal);
        System.out.println("Binary      => " + Integer.toBinaryString(decimal)); // Convert to binary
        System.out.println("Octal       => " + Integer.toOctalString(decimal));  // Convert to octal
        System.out.println("Hexadecimal => " + Integer.toHexString(decimal).toUpperCase()); // Convert to hex
    }
}
