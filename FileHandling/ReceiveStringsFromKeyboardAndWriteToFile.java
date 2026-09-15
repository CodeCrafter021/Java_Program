import java.io.*;
import java.util.Scanner;

// Program to take string input from user and write to a file
public class ReceiveStringsFromKeyboardAndWriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        PrintWriter pw = new PrintWriter(new FileWriter("user_input.txt"));
        
        if (pw == null) {
            System.out.println("Error creating file!");
            return;
        }
        
        System.out.print("Enter a string to save in the file: ");
        String sentence = sc.nextLine();
        
        pw.println(sentence); // Write to file
        pw.close();
        
        System.out.println("Your string has been written to the file.");
    }
}
