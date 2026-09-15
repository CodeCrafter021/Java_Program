import java.util.Scanner;

// Journal Question 8: Stack using Linked List
public class JQ8_StackUsingLinkedList {

    static class Node {
        int data; Node next;
        Node(int d) { data = d; next = null; }
    }

    static Node top = null;

    static boolean isEmpty() { return top == null; }

    static void push(Scanner sc) {
        System.out.print("Enter element: "); int data = sc.nextInt();
        Node nn = new Node(data);
        nn.next = top; top = nn;
        System.out.println("Element Inserted.");
    }

    static void pop() {
        if (isEmpty()) { System.out.println("Stack is empty."); return; }
        System.out.println("Popped element: " + top.data);
        top = top.next;
    }

    static void peek() {
        if (isEmpty()) System.out.println("Stack is Empty.");
        else System.out.println("Top element: " + top.data);
    }

    static void display() {
        if (isEmpty()) { System.out.println("Stack is empty."); return; }
        Node ptr = top;
        System.out.print("Stack: ");
        while (ptr != null) { System.out.print(ptr.data + " -> "); ptr = ptr.next; }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n1.Push  2.Pop  3.Peek  4.IsEmpty  5.Display  6.Exit");
            System.out.print("Choice => "); choice = sc.nextInt();
            switch (choice) {
                case 1: push(sc); break;
                case 2: pop(); break;
                case 3: peek(); break;
                case 4: System.out.println(isEmpty() ? "Stack is empty." : "Stack is NOT empty."); break;
                case 5: display(); break;
                case 6: return;
                default: System.out.println("Wrong choice.");
            }
        }
    }
}
