import java.util.Scanner;

// Journal Question 5: Count total number of items in a Singly Linked List
public class JQ5_CountItemsInLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    static Node head = null;

    static void insertNode(int value) {
        Node newNode = new Node(value);
        if (head == null) { head = newNode; return; }
        Node ptr = head;
        while (ptr.next != null) ptr = ptr.next;
        ptr.next = newNode;
    }

    // Count all nodes by traversing the list
    static int countNodes() {
        int count = 0;
        Node ptr = head;
        while (ptr != null) { count++; ptr = ptr.next; }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements do you want to add? => ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                insertNode(value);
            }
        }

        int total = countNodes();
        System.out.println("\nTotal number of items in the Singly Linked List: " + total);
    }
}
