import java.util.Scanner;

// Stack implementation using Array
// Stack follows LIFO - Last In First Out
// Operations: Push (add), Pop (remove), Peek (top element), Display
public class StackUsingArray {
    
    static final int MAX = 100;
    static int[] arr = new int[MAX]; // Array to store stack elements
    static int top = -1;             // -1 means stack is empty
    
    // Check if stack is empty
    static boolean isEmpty() {
        return top == -1;
    }
    
    // Check if stack is full
    static boolean isFull() {
        return top == MAX - 1;
    }
    
    // Push - add element to top of stack
    static void push(Scanner sc) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
        } else {
            System.out.print("Enter an element => ");
            int num = sc.nextInt();
            top++;
            arr[top] = num;
            System.out.println("Element was successfully entered into stack.");
        }
    }
    
    // Pop - remove element from top of stack
    static void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Popped element: " + arr[top]);
            top--;
        }
    }
    
    // Peek - view top element without removing
    static void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Top element is: " + arr[top]);
        }
    }
    
    // Display all stack elements
    static void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Stack Elements (top to bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Display");
            System.out.println("7. Exit");
            System.out.print("Enter a choice => ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: push(sc); break;
                case 2: pop(); break;
                case 3: peek(); break;
                case 4:
                    System.out.println(isEmpty() ? "Stack is Empty." : "Stack is NOT Empty.");
                    break;
                case 5:
                    System.out.println(isFull() ? "Stack is Full." : "Stack is NOT Full.");
                    break;
                case 6: display(); break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Wrong Choice. Please enter a valid option.");
            }
        }
    }
}
