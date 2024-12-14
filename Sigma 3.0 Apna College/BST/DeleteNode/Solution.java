package DeleteNode;

public class Solution {
    static class Node {
        Node left;
        int data;
        Node right;

        public Node(int data) {
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node deleteNode(Node root, int val) {
        if (root == null) return null;  // Handle case when root is null

        if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;  // Node has no children
            }
            if (root.left == null) {
                return root.right;  // Node has only right child
            } else if (root.right == null) {
                return root.left;  // Node has only left child
            }
            // Node has two children
            Node inorderSuccessor = findInorderSuccessor(root.right);
            root.data = inorderSuccessor.data;  // Replace root data with inorder successor
            root.right = deleteNode(root.right, inorderSuccessor.data);  // Delete the inorder successor
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 10, 3, 6, 11, 1, 4, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        // Print inorder traversal before deletion
        inorder(root);
        System.out.println();

        // Delete node with value 10 and update root
        root = deleteNode(root, 11);

        // Print inorder traversal after deletion
        inorder(root);
        System.out.println();
    }
}
