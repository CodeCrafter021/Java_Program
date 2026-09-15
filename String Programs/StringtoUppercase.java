import java.util.Scanner;

// Program to convert a string to uppercase
public class StringtoUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string => ");
        String str = sc.nextLine();
        
        // Convert each character to uppercase manually
        System.out.print("Uppercase string => ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(Character.toUpperCase(str.charAt(i)));
        }
        System.out.println();
    }
}
