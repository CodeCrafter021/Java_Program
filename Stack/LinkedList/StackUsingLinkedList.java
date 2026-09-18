import java.util.Scanner;

// Stack implementation using Linked List
// Each node stores data and points to the next node
public class StackUsingLinkedList {
    
    // Node class - each node holds data and link to next node
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static Node top = null; // Top of stack (null = empty)
    
    // Check if stack is empty
    static boolean isEmpty() {
        return top == null;
    }
    
    // Push - add new node at the top
    static void push(Scanner sc) {
        System.out.print("Enter element to insert: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        
        newNode.next = top; // New node points to old top
        top = newNode;      // New node becomes new top
        System.out.println("Element Inserted.");
    }
    
    // Pop - remove node from top
    static void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Popped element: " + top.data);
            top = top.next; // Move top to next node
        }
    }
    
    // Peek - view top element
    static void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }
    
    // Display all elements
    static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Node ptr = top;
            System.out.print("Stack elements: ");
            while (ptr != null) {
                System.out.print(ptr.data + " -> ");
                ptr = ptr.next;
            }
            System.out.println("NULL");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. IsEmpty\n5. Display\n6. Exit");
            System.out.print("Enter your choice => ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: push(sc); break;
                case 2: pop(); break;
                case 3: peek(); break;
                case 4:
                    System.out.println(isEmpty() ? "Stack is empty." : "Stack is NOT empty.");
                    break;
                case 5: display(); break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong choice. Please choose a valid option.");
            }
        }
    }
}
