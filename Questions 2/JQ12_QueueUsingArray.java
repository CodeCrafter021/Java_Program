import java.util.Scanner;

// Journal Question 12: Queue using Array - menu driven
public class JQ12_QueueUsingArray {
    static final int MAX = 100;
    static int[] num = new int[MAX];
    static int front = -1, rear = -1;

    static boolean isEmpty() { return front == -1; }
    static boolean isFull()  { return rear == MAX - 1; }

    static void enqueue(Scanner sc) {
        if (isFull()) { System.out.println("Queue is Full..."); return; }
        System.out.print("Enter element: "); int val = sc.nextInt();
        if (front == -1) { front = 0; rear = 0; } else rear++;
        num[rear] = val;
        System.out.println("Element Inserted...");
    }

    static void dequeue() {
        if (isEmpty()) { System.out.println("Queue is Empty..."); return; }
        System.out.println("Removed: " + num[front]);
        front++;
        if (front > rear) { front = -1; rear = -1; }
    }

    static void peek() {
        if (isEmpty()) System.out.println("Queue is Empty...");
        else System.out.println("Front element: " + num[front]);
    }

    static void display() {
        if (isEmpty()) { System.out.println("Queue is Empty..."); return; }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) System.out.print(num[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n1.Enqueue  2.Dequeue  3.Peek  4.isEmpty  5.isFull  6.Display  7.Exit");
            System.out.print("Choice: "); choice = sc.nextInt();
            switch (choice) {
                case 1: enqueue(sc); break;
                case 2: dequeue(); break;
                case 3: peek(); break;
                case 4: System.out.println(isEmpty() ? "Queue is Empty." : "Queue is NOT Empty."); break;
                case 5: System.out.println(isFull()  ? "Queue is Full."  : "Queue is NOT Full."); break;
                case 6: display(); break;
                case 7: return;
                default: System.out.println("Wrong choice.");
            }
        }
    }
}
