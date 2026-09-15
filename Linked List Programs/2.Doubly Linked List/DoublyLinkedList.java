import java.util.Scanner;

// Doubly Linked List - Full Program
// Each node has data, a link to next node, and a link to previous node
// Direction: null <- head <-> node1 <-> node2 <-> node3 -> null
public class DoublyLinkedList {
    
    // Node class with prev and next pointers
    static class Node {
        int data;
        Node prev;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    
    static Node head = null; // Start of list
    static Node end = null;  // End of list
    static Scanner sc = new Scanner(System.in);
    
    // Create doubly linked list
    static void create() {
        System.out.print("Enter the number of nodes to create: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            
            if (head == null) {
                head = newNode;
                end = newNode;
            } else {
                Node ptr = head;
                while (ptr.next != null) ptr = ptr.next;
                ptr.next = newNode;
                newNode.prev = ptr;
                end = newNode;
            }
        }
        System.out.println("Doubly Linked List created with " + n + " nodes!");
    }
    
    // Insert at any position
    static void insertAnywhere() {
        System.out.print("Enter data to insert: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        
        System.out.print("Enter position (1 for first): ");
        int pos = sc.nextInt();
        
        if (pos == 1) {
            if (head == null) {
                head = newNode; end = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            System.out.println("Node inserted at position " + pos);
            return;
        }
        
        Node ptr = head;
        for (int i = 1; i < pos - 1 && ptr != null; i++) ptr = ptr.next;
        
        if (ptr == null) {
            System.out.println("Invalid position!");
            return;
        }
        
        newNode.next = ptr.next;
        newNode.prev = ptr;
        if (ptr.next != null) ptr.next.prev = newNode;
        else end = newNode;
        ptr.next = newNode;
        System.out.println("Node inserted at position " + pos);
    }
    
    // Delete at any position
    static void deleteAnywhere() {
        if (head == null) { System.out.println("List is empty!"); return; }
        
        System.out.print("Enter position to delete (1 for first): ");
        int pos = sc.nextInt();
        Node ptr = head;
        
        if (pos == 1) {
            head = head.next;
            if (head != null) head.prev = null;
            else end = null;
            System.out.println("First node deleted.");
            return;
        }
        
        for (int i = 1; i < pos && ptr != null; i++) ptr = ptr.next;
        
        if (ptr == null) { System.out.println("Invalid position!"); return; }
        
        ptr.prev.next = ptr.next;
        if (ptr.next != null) ptr.next.prev = ptr.prev;
        else end = ptr.prev;
        System.out.println("Node with data " + ptr.data + " deleted.");
    }
    
    // Search for a value
    static void search() {
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();
        Node ptr = head;
        int pos = 1;
        boolean found = false;
        
        while (ptr != null) {
            if (ptr.data == key) {
                System.out.println("Value " + key + " found at position " + pos);
                found = true;
            }
            ptr = ptr.next;
            pos++;
        }
        if (!found) System.out.println("Value not found.");
    }
    
    // Display forward and backward
    static void display() {
        if (head == null) { System.out.println("List is Empty."); return; }
        
        Node ptr = head;
        System.out.print("Forward: ");
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
            System.out.println("\n1. Create List");
            System.out.println("2. Insert Node (Any Position)");
            System.out.println("3. Delete Node (Any Position)");
            System.out.println("4. Search");
            System.out.println("5. Display (Forward + Backward)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: create(); break;
                case 2: insertAnywhere(); break;
                case 3: deleteAnywhere(); break;
                case 4: search(); break;
                case 5: display(); break;
                case 6: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
