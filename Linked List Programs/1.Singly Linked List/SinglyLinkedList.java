import java.util.Scanner;

// Singly Linked List - Full Program with all operations
// Each node has data and a link (next) to the next node
// Direction: head -> node1 -> node2 -> node3 -> null
public class SinglyLinkedList {
    
    // Node class - one unit of the linked list
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static Node head = null; // Head is the starting point of the list
    static Scanner sc = new Scanner(System.in);
    
    // Create linked list with n elements
    static void create() {
        System.out.print("Enter required size of list: ");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);
            
            if (head == null) {
                head = newNode; // First node becomes head
            } else {
                // Traverse to last node and attach new node
                Node ptr = head;
                while (ptr.next != null) {
                    ptr = ptr.next;
                }
                ptr.next = newNode;
            }
        }
        System.out.println("Singly Linked List created successfully!");
    }
    
    // Insert node at any position
    static void insertAtPosition() {
        System.out.print("Enter position to insert at: ");
        int pos = sc.nextInt();
        System.out.print("Enter value to insert: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        
        if (pos == 1) {
            newNode.next = head; // New node points to old head
            head = newNode;      // New node becomes new head
            return;
        }
        
        Node ptr = head;
        for (int i = 1; i < pos - 1 && ptr != null; i++) {
            ptr = ptr.next;
        }
        
        if (ptr != null) {
            newNode.next = ptr.next;
            ptr.next = newNode;
            System.out.println("Node inserted at position " + pos);
        } else {
            System.out.println("Position out of range!");
        }
    }
    
    // Delete node at any position
    static void deleteAtPosition() {
        if (head == null) { System.out.println("List is empty!"); return; }
        
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();
        
        if (pos == 1) {
            head = head.next; // Move head to second node
            System.out.println("First node deleted.");
            return;
        }
        
        Node ptr = head;
        for (int i = 1; i < pos - 1 && ptr != null; i++) {
            ptr = ptr.next;
        }
        
        if (ptr != null && ptr.next != null) {
            ptr.next = ptr.next.next; // Skip the node to delete
            System.out.println("Node deleted at position " + pos);
        } else {
            System.out.println("Position out of range!");
        }
    }
    
    // Search for a value in the list
    static void search() {
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();
        Node ptr = head;
        int pos = 1;
        boolean found = false;
        
        while (ptr != null) {
            if (ptr.data == key) {
                System.out.println("Element " + key + " found at position " + pos);
                found = true;
                break;
            }
            ptr = ptr.next;
            pos++;
        }
        if (!found) System.out.println("Element not found in list.");
    }
    
    // Display all nodes
    static void display() {
        if (head == null) { System.out.println("List is empty!"); return; }
        Node ptr = head;
        System.out.print("List: ");
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n1. Create List");
            System.out.println("2. Insert Node");
            System.out.println("3. Delete Node");
            System.out.println("4. Search Node");
            System.out.println("5. Display List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: create(); break;
                case 2: insertAtPosition(); break;
                case 3: deleteAtPosition(); break;
                case 4: search(); break;
                case 5: display(); break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
