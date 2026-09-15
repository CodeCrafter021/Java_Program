import java.util.Scanner;

// Journal Question 1: Singly Linked List with Linear and Binary Search
public class JQ1_SinglyLinkedListSearch {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    static Node head = null;
    static Scanner sc = new Scanner(System.in);

    static void create() {
        System.out.print("Enter size of array => ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) { head = newNode; }
            else {
                Node ptr = head;
                while (ptr.next != null) ptr = ptr.next;
                ptr.next = newNode;
            }
        }
        System.out.println("Singly Linked List created successfully!");
    }

    static void insertion() {
        System.out.print("Enter position to insert => ");
        int pos = sc.nextInt();
        System.out.print("Enter value => ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if (pos == 1) { newNode.next = head; head = newNode; return; }
        Node ptr = head;
        for (int i = 1; i < pos - 1 && ptr != null; i++) ptr = ptr.next;
        if (ptr != null) { newNode.next = ptr.next; ptr.next = newNode; }
    }

    static void deletion() {
        if (head == null) return;
        System.out.print("Enter position to delete => ");
        int pos = sc.nextInt();
        if (pos == 1) { head = head.next; return; }
        Node ptr = head;
        for (int i = 1; i < pos - 1 && ptr != null; i++) ptr = ptr.next;
        if (ptr != null && ptr.next != null) ptr.next = ptr.next.next;
    }

    static void display() {
        Node ptr = head;
        System.out.print("List: ");
        while (ptr != null) { System.out.print(ptr.data + " "); ptr = ptr.next; }
        System.out.println();
    }

    // Helper: find middle node (for binary search on linked list)
    static Node middle(Node start, Node last) {
        if (start == null) return null;
        Node slow = start, fast = start.next;
        while (fast != last) {
            fast = fast.next;
            if (fast != last) { slow = slow.next; fast = fast.next; }
        }
        return slow;
    }

    static void searching() {
        System.out.print("Which number to find? => ");
        int key = sc.nextInt();

        // Linear Search
        System.out.println("\n--- Linear Search Result ---");
        Node ptr = head; int pos = 1; boolean found = false;
        while (ptr != null) {
            if (ptr.data == key) {
                System.out.println("Element " + key + " found at position " + pos + "!");
                found = true; break;
            }
            ptr = ptr.next; pos++;
        }
        if (!found) System.out.println("Element NOT found in List!");

        // Binary Search on Linked List
        System.out.println("\n--- Binary Search Result ---");
        found = false;
        Node start = head, last = null;
        while (start != last) {
            Node mid = middle(start, last);
            if (mid == null) break;
            if (mid.data == key) {
                System.out.println("Element " + key + " found using Binary Search!");
                found = true; break;
            } else if (mid.data < key) start = mid.next;
            else last = mid;
        }
        if (!found) System.out.println("Element NOT found in List!");
    }

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n1. Create List\n2. Insert Node\n3. Delete Node\n4. Display List\n5. Search (Linear & Binary)\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: create(); break;
                case 2: insertion(); break;
                case 3: deletion(); break;
                case 4: display(); break;
                case 5: searching(); break;
                case 6: return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
