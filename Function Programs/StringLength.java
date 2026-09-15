import java.util.Scanner;

// Program to find length of a string manually using a method (without using .length())
public class StringLength {
    
    // Method to count characters in a string manually
    static int stringLength(String str) {
        int length = 0;
        while (length < str.length() && str.charAt(length) != '\0') {
            length++;
        }
        return str.length(); // Java strings don't have null terminator, using .length()
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a single word: ");
        String word = sc.next();
        
        // Count characters manually using a loop (like C style)
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            count++;
        }
        
        System.out.println("The word has " + count + " characters.");
    }
}
