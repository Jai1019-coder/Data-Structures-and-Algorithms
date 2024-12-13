package KLevel;

public class Solution2 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void kLevel(Node root, int k){
        if (root == null) {
            return;
        }
        if (k==2) {
            if (root.left == null && root.right == null) {
                return;
            }
            else if (root.left == null) {
                System.out.print(root.right.data+" ");
                return;
            }
            else if(root.right == null){
                System.out.print(root.left.data+" ");
                return;
            }
            else{
                System.out.print(root.left.data+" "+root.right.data+" ");
                return;
            }
        }
        kLevel(root.left, k-1);
        kLevel(root.right, k-1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        kLevel(root, 3);
        System.out.println();
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.right = new Node(4);
        root2.left.right.right = new Node(5);
        root2.left.right.right.right = new Node(6);
        kLevel(root2, 2);
    }
}
