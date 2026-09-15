package Java.ConversionPrograms;

import java.util.Locale;

public class ConversionExamples {
    public static void main(String[] args) {
        System.out.println("Binary to octal: " + Integer.toOctalString(Integer.parseInt("101101", 2)));
        System.out.println("Octal to decimal: " + Integer.parseInt("755", 8));
        System.out.println("Decimal to octal: " + Integer.toOctalString(493));
        System.out.println("Hexadecimal to decimal: " + Integer.parseInt("1ED", 16));
        System.out.println("Decimal to hexadecimal: " + Integer.toHexString(493));
        System.out.println("Decimal to binary: " + Integer.toBinaryString(45));
        System.out.println("Binary to decimal: " + Integer.parseInt("101101", 2));
        System.out.println("Boolean to string: " + Boolean.toString(true));
        System.out.println("String to double: " + Double.parseDouble("12.50"));
        System.out.println("Double to string: " + Double.toString(12.50));
        System.out.println("String to long: " + Long.parseLong("123456789"));
        System.out.println("Long to string: " + Long.toString(123456789L));
        System.out.println("int to char: " + (char) 65);
        System.out.println("char to int: " + (int) 'A');
        System.out.println("Locale used: " + Locale.getDefault());
    }
}