import java.util.Scanner;

// Journal Question 7: Stack using Array - menu driven
public class JQ7_StackUsingArray {
    static final int MAX = 100;
    static int[] arr = new int[MAX];
    static int top = -1;

    static boolean isEmpty() { return top == -1; }
    static boolean isFull()  { return top == MAX - 1; }

    static void push(Scanner sc) {
        if (isFull()) { System.out.println("Stack Overflow!"); return; }
        System.out.print("Enter element => "); int num = sc.nextInt();
        arr[++top] = num;
        System.out.println("Element entered into stack.");
    }

    static void pop() {
        if (isEmpty()) { System.out.println("Stack is Empty."); return; }
        System.out.println("Popped: " + arr[top--]);
    }

    static void peek() {
        if (isEmpty()) System.out.println("Stack is Empty.");
        else System.out.println("Top element: " + arr[top]);
    }

    static void display() {
        if (isEmpty()) { System.out.println("Stack is Empty."); return; }
        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n1.Push  2.Pop  3.Peek  4.isEmpty  5.isFull  6.Display  7.Exit");
            System.out.print("Choice => "); choice = sc.nextInt();
            switch (choice) {
                case 1: push(sc); break;
                case 2: pop(); break;
                case 3: peek(); break;
                case 4: System.out.println(isEmpty() ? "Stack is Empty." : "Stack is NOT Empty."); break;
                case 5: System.out.println(isFull()  ? "Stack is Full."  : "Stack is NOT Full."); break;
                case 6: display(); break;
                case 7: return;
                default: System.out.println("Wrong Choice.");
            }
        }
    }
}
