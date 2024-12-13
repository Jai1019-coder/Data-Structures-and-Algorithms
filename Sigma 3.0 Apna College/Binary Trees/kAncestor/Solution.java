package kAncestor;

public class Solution {
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
    public static int kAncestor(Node root, int data, int k){
        if(root == null) return -1;
        if(root.data == data) return 0;
        int leftDistance = kAncestor(root.left, data, k);
        int rightDistance = kAncestor(root.right, data, k);
        if(leftDistance == -1 && rightDistance == -1) return -1;
        else{
            int max = Math.max(leftDistance, rightDistance);
            if(max+1 == k) System.out.println(root.data);
            return max+1;
        }
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        kAncestor(root, 4, 2);
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.right = new Node(4);
        root2.left.right.right = new Node(5);
        root2.left.right.right.right = new Node(6);
        kAncestor(root2, 6, 3);
    }
}
