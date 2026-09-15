import java.util.Scanner;

// Program to find the length of a string manually (without using .length())
public class LengthofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Count characters manually using a loop (C-style approach)
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        
        System.out.println("The length of the string is: " + length);
    }
}
