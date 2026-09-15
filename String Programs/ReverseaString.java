import java.util.Scanner;

// Program to reverse a string
public class ReverseaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();
        
        int length = str.length();
        
        // Print characters from last to first (reverse order)
        System.out.print("Reversed string: ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
