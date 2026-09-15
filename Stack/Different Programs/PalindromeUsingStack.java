import java.util.Scanner;
import java.util.Stack;

// Program to check if a word is palindrome using Stack
// Push all characters, then pop and compare with original
public class PalindromeUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        Stack<Character> stack = new Stack<>();
        
        // Push all characters to stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        // Pop characters and compare with original (stack reverses the string)
        boolean isPalindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
}
