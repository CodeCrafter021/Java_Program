package Queue.LinkedList;

import java.util.Scanner;

// Queue implementation using Linked List
// Front node is removed (dequeue), new nodes added at rear (enqueue)
public class QueueUsingLinkedList {
    
    // Node class for each queue element
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static Node front = null; // Front of queue (for removal)
    static Node rear = null;  // Rear of queue (for insertion)
    
    // Check if queue is empty
    static boolean isEmpty() {
        return front == null;
    }
    
    // Enqueue - add new node at rear
    static void enqueue(Scanner sc) {
        System.out.print("Enter an element: ");
        int val = sc.nextInt();
        Node newNode = new Node(val);
        
        if (front == null) {
            // First element - both front and rear point to it
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode; // Current rear points to new node
            rear = newNode;      // New node becomes new rear
        }
        System.out.println("Element is Inserted...");
    }
    
    // Dequeue - remove node from front
    static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Removed element: " + front.data);
            front = front.next; // Front moves to next node
            if (front == null) {
                rear = null; // Queue became empty
            }
        }
    }
    
    // Peek - view front element
    static void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            System.out.println("Front element is: " + front.data);
        }
    }
    
    // Display all elements
    static void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            Node ptr = front;
            System.out.print("Queue elements: ");
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
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Peek\n4. isEmpty\n5. isFull\n6. Display\n7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: enqueue(sc); break;
                case 2: dequeue(); break;
                case 3: peek(); break;
                case 4:
                    System.out.println(isEmpty() ? "Queue is Empty." : "Queue is NOT Empty.");
                    break;
                case 5:
                    // Linked list queue is never truly full (until memory runs out)
                    System.out.println("Queue is NOT Full (Linked list has dynamic memory).");
                    break;
                case 6: display(); break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong Choice. Please enter a valid choice.");
            }
        }
    }
}
