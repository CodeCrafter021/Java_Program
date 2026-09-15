import java.util.Scanner;
import java.util.Stack;

// Journal Question 9: Convert Infix expression to Postfix using Stack
public class JQ9_InfixToPostfix {

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

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c); // Operand goes directly to output
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postfix.append(stack.pop());
                if (!stack.isEmpty()) stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c))
                    postfix.append(stack.pop());
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) postfix.append(stack.pop());
        System.out.println("Postfix expression: " + postfix);
    }
}
