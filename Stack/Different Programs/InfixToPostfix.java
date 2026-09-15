import java.util.Scanner;
import java.util.Stack;

// Program to convert Infix expression to Postfix expression using Stack
// Infix:   A + B * C  (operator between operands)
// Postfix: A B C * +  (operator after operands)
public class InfixToPostfix {
    
    // Returns precedence (priority) of operators
    static int precedence(char x) {
        if (x == '(') return 0;
        if (x == '+' || x == '-') return 1;
        if (x == '*' || x == '/') return 2;
        if (x == '^') return 3;
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter infix expression: ");
        String exp = sc.next();
        
        Stack<Character> stack = new Stack<>(); // Java has built-in Stack
        StringBuilder postfix = new StringBuilder();
        
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            
            if (Character.isLetterOrDigit(c)) {
                // If operand (letter/digit), add directly to result
                postfix.append(c);
            } else if (c == '(') {
                // Push opening bracket to stack
                stack.push(c);
            } else if (c == ')') {
                // Pop until we find matching opening bracket
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove the '('
            } else {
                // Operator - pop higher/equal precedence operators first
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        
        System.out.println("Postfix expression: " + postfix.toString());
    }
}
