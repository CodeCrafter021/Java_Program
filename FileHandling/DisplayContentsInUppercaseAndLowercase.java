import java.io.*;
import java.util.Scanner;

// Program to display file contents in UPPERCASE and lowercase
public class DisplayContentsInUppercaseAndLowercase {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the filename: ");
        String filename = sc.next();
        
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("Error: Could not open file.");
            return;
        }
        
        // Display in UPPERCASE
        System.out.println("\nFile contents in UPPERCASE:");
        FileReader fr = new FileReader(filename);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print(Character.toUpperCase((char) ch));
        }
        fr.close();
        
        // Display in lowercase
        System.out.println("\n\nFile contents in lowercase:");
        fr = new FileReader(filename);
        while ((ch = fr.read()) != -1) {
            System.out.print(Character.toLowerCase((char) ch));
        }
        fr.close();
        System.out.println();
    }
}
