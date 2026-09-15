// Program demonstrating built-in String methods in Java
// Equivalent to C's strlen, strcpy, strcat, strcmp
public class J36_StringManipulationFunctions {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // String Length (like strlen in C)
        System.out.println("String Length: length()");
        System.out.println("The String is: " + str1);
        System.out.println("Its length is: " + str1.length() + "\n");

        // String Copy (like strcpy in C)
        System.out.println("String Copy: assignment in Java");
        String str3 = str1; // In Java, just assign
        System.out.println("We copied str1 into str3.");
        System.out.println("str3 is now: " + str3 + "\n");

        // String Concatenation (like strcat in C)
        System.out.println("String Concatenation: concat() or + operator");
        System.out.println("Joining \"" + str2 + "\" onto \"" + str3 + "\"");
        str3 = str3 + " " + str2; // Use + operator
        System.out.println("str3 is now: " + str3 + "\n");

        // String Compare (like strcmp in C)
        System.out.println("String Compare: equals() or compareTo()");
        System.out.println("Comparing \"" + str1 + "\" and \"Hello\"");
        int result = str1.compareTo("Hello"); // 0 means equal
        System.out.println("Result: " + result);

        System.out.println("\nComparing \"" + str1 + "\" and \"" + str2 + "\"");
        result = str1.compareTo(str2);
        System.out.println("Result: " + result);
    }
}
