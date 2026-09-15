import java.util.Scanner;

// Journal Question 13: Queue using Linked List - menu driven
public class JQ13_QueueUsingLinkedList {

    static class Node {
        int data; Node next;
        Node(int d) { data = d; next = null; }
    }

    static Node front = null, rear = null;

    static boolean isEmpty() { return front == null; }

    static void enqueue(Scanner sc) {
        System.out.print("Enter element: "); int val = sc.nextInt();
        Node nn = new Node(val);
        if (front == null) { front = nn; rear = nn; }
        else { rear.next = nn; rear = nn; }
        System.out.println("Element Inserted...");
    }

    static void dequeue() {
        if (isEmpty()) { System.out.println("Queue is Empty."); return; }
        System.out.println("Removed: " + front.data);
        front = front.next;
        if (front == null) rear = null;
    }

    static void peek() {
        if (isEmpty()) System.out.println("Queue is Empty...");
        else System.out.println("Front element: " + front.data);
    }

    static void display() {
        if (isEmpty()) { System.out.println("Queue is Empty..."); return; }
        Node ptr = front;
        System.out.print("Queue: ");
        while (ptr != null) { System.out.print(ptr.data + " -> "); ptr = ptr.next; }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n1.Enqueue  2.Dequeue  3.Peek  4.isEmpty  5.Display  6.Exit");
            System.out.print("Choice: "); choice = sc.nextInt();
            switch (choice) {
                case 1: enqueue(sc); break;
                case 2: dequeue(); break;
                case 3: peek(); break;
                case 4: System.out.println(isEmpty() ? "Queue is Empty." : "Queue is NOT Empty."); break;
                case 5: display(); break;
                case 6: return;
                default: System.out.println("Wrong Choice.");
            }
        }
    }
}
