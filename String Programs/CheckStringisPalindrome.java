import java.util.Scanner;

// Program to check if a string is a palindrome
// Palindrome means the string reads same forwards and backwards (e.g., "madam", "racecar")
public class CheckStringisPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = true;
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // Read full line with spaces
        
        int length = str.length();
        
        // Compare characters from both ends moving towards center
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println(str + " is a Palindrome!");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
    }
}
