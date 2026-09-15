import java.util.Scanner;

// Journal Question 6: Doubly Linked List - Full program (same as JQ4 but standalone)
// This covers Create, Insert (first/last/random), Delete, Search, Display
public class JQ6_DoublyLinkedListFull {

    static class Node {
        int data;
        Node prev, next;
        Node(int data) { this.data = data; this.prev = null; this.next = null; }
    }

    static Node head = null, tail = null;
    static Scanner sc = new Scanner(System.in);

    static void create() {
        System.out.print("Enter number of nodes: "); int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Node " + (i+1) + " data: "); int d = sc.nextInt();
            Node nn = new Node(d);
            if (head == null) { head = nn; tail = nn; }
            else { tail.next = nn; nn.prev = tail; tail = nn; }
        }
        System.out.println("Doubly Linked List created!");
    }

    static void insertFirst() {
        System.out.print("Enter data: "); int d = sc.nextInt();
        Node nn = new Node(d);
        if (head == null) { head = nn; tail = nn; }
        else { nn.next = head; head.prev = nn; head = nn; }
        System.out.println("Inserted at first.");
    }

    static void insertLast() {
        System.out.print("Enter data: "); int d = sc.nextInt();
        Node nn = new Node(d);
        if (head == null) { head = nn; tail = nn; }
        else { tail.next = nn; nn.prev = tail; tail = nn; }
        System.out.println("Inserted at last.");
    }

    static void deleteFirst() {
        if (head == null) { System.out.println("Empty!"); return; }
        head = head.next;
        if (head != null) head.prev = null; else tail = null;
        System.out.println("First node deleted.");
    }

    static void deleteLast() {
        if (head == null) { System.out.println("Empty!"); return; }
        tail = tail.prev;
        if (tail != null) tail.next = null; else head = null;
        System.out.println("Last node deleted.");
    }

    static void search() {
        System.out.print("Enter value to search: "); int key = sc.nextInt();
        Node ptr = head; int pos = 1; boolean found = false;
        while (ptr != null) {
            if (ptr.data == key) { System.out.println("Found at position " + pos); found = true; }
            ptr = ptr.next; pos++;
        }
        if (!found) System.out.println("Not found.");
    }

    static void display() {
        if (head == null) { System.out.println("Empty!"); return; }
        Node ptr = head;
        System.out.print("Forward:  ");
        while (ptr != null) { System.out.print(ptr.data + " <-> "); ptr = ptr.next; }
        System.out.println("NULL");
        ptr = tail;
        System.out.print("Backward: ");
        while (ptr != null) { System.out.print(ptr.data + " <-> "); ptr = ptr.prev; }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n1.Create  2.InsertFirst  3.InsertLast  4.DeleteFirst  5.DeleteLast  6.Search  7.Display  8.Exit");
            System.out.print("Choice: "); choice = sc.nextInt();
            switch (choice) {
                case 1: create(); break;
                case 2: insertFirst(); break;
                case 3: insertLast(); break;
                case 4: deleteFirst(); break;
                case 5: deleteLast(); break;
                case 6: search(); break;
                case 7: display(); break;
                case 8: return;
                default: System.out.println("Invalid!");
            }
        }
    }
}
