import java.util.Scanner;

// Program to count total nodes and leaf nodes in a Binary Tree
// Leaf node = a node that has NO children (both left and right are null)
public class CountLeafAndTotalNodes {
    
    static class Node {
        int value;
        Node leftBranch;
        Node rightBranch;
        
        Node(int value) {
            this.value = value;
            this.leftBranch = null;
            this.rightBranch = null;
        }
    }
    
    static Scanner sc = new Scanner(System.in);
    
    // Build tree recursively - user enters node values
    static Node buildTree() {
        int val = sc.nextInt();
        if (val == 0) return null; // 0 means no node (stop here)
        
        Node newNode = new Node(val);
        System.out.print("Enter left branch for " + val + " (Type 0 to stop): ");
        newNode.leftBranch = buildTree();
        System.out.print("Enter right branch for " + val + " (Type 0 to stop): ");
        newNode.rightBranch = buildTree();
        
        return newNode;
    }
    
    // Count all nodes in tree
    static int countTotalNodes(Node root) {
        if (root == null) return 0;
        return 1 + countTotalNodes(root.leftBranch) + countTotalNodes(root.rightBranch);
    }
    
    // Count only leaf nodes (nodes with no children)
    static int countLeafNodes(Node root) {
        if (root == null) return 0;
        if (root.leftBranch == null && root.rightBranch == null) return 1; // It's a leaf!
        return countLeafNodes(root.leftBranch) + countLeafNodes(root.rightBranch);
    }
    
    public static void main(String[] args) {
        System.out.print("Enter root value (Type 0 to stop): ");
        Node root = buildTree();
        
        System.out.println("\nTotal Nodes in the tree: " + countTotalNodes(root));
        System.out.println("Leaf Nodes in the tree: " + countLeafNodes(root));
    }
}
