import java.util.Scanner;

// Program to copy one string to another character by character (C-style approach)
public class CopyOneStringtoAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter source string => ");
        String source = sc.nextLine();
        
        // Copy character by character using a char array (like C style)
        char[] destination = new char[source.length()];
        for (int i = 0; i < source.length(); i++) {
            destination[i] = source.charAt(i);
        }
        
        String copiedString = new String(destination);
        System.out.println("Copied string => " + copiedString);
    }
}
