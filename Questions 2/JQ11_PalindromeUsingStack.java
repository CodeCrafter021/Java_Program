import java.util.Scanner;
import java.util.Stack;

// Journal Question 11: Check if a string is palindrome using Stack
public class JQ11_PalindromeUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) stack.push(str.charAt(i));

        boolean isPalindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) { isPalindrome = false; break; }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
}
