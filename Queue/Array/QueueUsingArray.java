import java.util.Scanner;

// Queue implementation using Array
// Queue follows FIFO - First In First Out
// Like a line of people - first person in, first person out
public class QueueUsingArray {
    
    static final int MAX = 100;
    static int[] num = new int[MAX];
    static int front = -1, rear = -1; // Both -1 means empty
    
    // Check if queue is empty
    static boolean isEmpty() {
        return front == -1;
    }
    
    // Check if queue is full
    static boolean isFull() {
        return rear == MAX - 1;
    }
    
    // Enqueue - add element to rear (end) of queue
    static void enqueue(Scanner sc) {
        if (isFull()) {
            System.out.println("Queue is Full...");
        } else {
            System.out.print("Enter an element: ");
            int val = sc.nextInt();
            if (front == -1) {
                front = 0;
                rear = 0;
            } else {
                rear++;
            }
            num[rear] = val;
            System.out.println("Element is Inserted...");
        }
    }
    
    // Dequeue - remove element from front of queue
    static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            System.out.println("Removed element: " + num[front]);
            front++;
            if (front > rear) {
                front = -1;
                rear = -1; // Queue is now empty, reset
            }
        }
    }
    
    // Peek - view front element
    static void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            System.out.println("Front element is: " + num[front]);
        }
    }
    
    // Display all elements
    static void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            System.out.println("Queue elements (front to rear):");
            for (int i = front; i <= rear; i++) {
                System.out.println(num[i]);
            }
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
                    System.out.println(isFull() ? "Queue is Full." : "Queue is NOT Full.");
                    break;
                case 6: display(); break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Wrong choice. Please enter a valid choice.");
            }
        }
    }
}
