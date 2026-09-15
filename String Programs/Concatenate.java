import java.util.Scanner;

// Program to join (concatenate) two strings together
public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        // Use + operator to join strings in Java
        String joined = str1 + str2;
        
        System.out.println("Joined String: " + joined);
    }
}
