import java.util.Scanner;

// Journal Question 4: Doubly Linked List with Create, Insert, Delete, Search, Display
public class JQ4_DoublyLinkedList {

    static class Node {
        int data;
        Node prev, next;
        Node(int data) { this.data = data; this.prev = null; this.next = null; }
    }

    static Node head = null, end = null;
    static Scanner sc = new Scanner(System.in);

    static void create() {
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) { head = newNode; end = newNode; }
            else {
                Node ptr = head;
                while (ptr.next != null) ptr = ptr.next;
                ptr.next = newNode; newNode.prev = ptr; end = newNode;
            }
        }
        System.out.println("Doubly Linked List created!");
    }

    static void insertAnywhere() {
        System.out.print("Enter data to insert: "); int data = sc.nextInt();
        System.out.print("Enter position (1 for first): "); int pos = sc.nextInt();
        Node newNode = new Node(data);
        if (pos == 1) {
            if (head == null) { head = newNode; end = newNode; }
            else { newNode.next = head; head.prev = newNode; head = newNode; }
            System.out.println("Inserted at position " + pos);
            return;
        }
        Node ptr = head;
        for (int i = 1; i < pos - 1 && ptr != null; i++) ptr = ptr.next;
        if (ptr == null) { System.out.println("Invalid position!"); return; }
        newNode.next = ptr.next; newNode.prev = ptr;
        if (ptr.next != null) ptr.next.prev = newNode; else end = newNode;
        ptr.next = newNode;
        System.out.println("Inserted at position " + pos);
    }

    static void deleteAnywhere() {
        if (head == null) { System.out.println("List is empty!"); return; }
        System.out.print("Enter position to delete: "); int pos = sc.nextInt();
        Node ptr = head;
        if (pos == 1) {
            head = head.next;
            if (head != null) head.prev = null; else end = null;
            System.out.println("First node deleted."); return;
        }
        for (int i = 1; i < pos && ptr != null; i++) ptr = ptr.next;
        if (ptr == null) { System.out.println("Invalid position!"); return; }
        ptr.prev.next = ptr.next;
        if (ptr.next != null) ptr.next.prev = ptr.prev; else end = ptr.prev;
        System.out.println("Node deleted.");
    }

    static void searching() {
        System.out.print("Enter value to search: "); int key = sc.nextInt();
        Node ptr = head; int pos = 1; boolean found = false;
        while (ptr != null) {
            if (ptr.data == key) { System.out.println("Value " + key + " found at position " + pos); found = true; }
            ptr = ptr.next; pos++;
        }
        if (!found) System.out.println("Value not found.");
    }

    static void display() {
        if (head == null) { System.out.println("List is Empty."); return; }
        Node ptr = head;
        System.out.print("Forward:  ");
        while (ptr != null) { System.out.print(ptr.data + " -> "); ptr = ptr.next; }
        System.out.println("NULL");
        ptr = end;
        System.out.print("Backward: ");
        while (ptr != null) { System.out.print(ptr.data + " -> "); ptr = ptr.prev; }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n1. Create\n2. Insert\n3. Delete\n4. Search\n5. Display\n6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: create(); break;
                case 2: insertAnywhere(); break;
                case 3: deleteAnywhere(); break;
                case 4: searching(); break;
                case 5: display(); break;
                case 6: return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
