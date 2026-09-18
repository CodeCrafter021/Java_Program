// Binary Tree - Demonstrate Inorder, Preorder, Postorder traversal
// Tree is built manually in code (hardcoded values)
public class BinaryTree {
    
    // Node class for tree - each node has left and right child
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // Create a new tree node
    static Node createNode(int x) {
        return new Node(x);
    }
    
    // Inorder: Left -> Root -> Right
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    // Preorder: Root -> Left -> Right
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    // Postorder: Left -> Right -> Root
    static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    
    public static void main(String[] args) {
        // Build tree manually (same structure as C program)
        Node root = createNode(2);
        root.left = createNode(7);
        root.right = createNode(5);
        root.left.left = createNode(2);
        root.left.right = createNode(6);
        root.left.right.left = createNode(5);
        root.left.right.right = createNode(11);
        root.right.right = createNode(9);
        root.right.right.left = createNode(4);
        
        System.out.print("Inorder:   "); inorder(root);   System.out.println();
        System.out.print("Preorder:  "); preorder(root);  System.out.println();
        System.out.print("Postorder: "); postorder(root); System.out.println();
    }
}
