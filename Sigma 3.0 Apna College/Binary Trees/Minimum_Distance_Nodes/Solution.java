package Minimum_Distance_Nodes;

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
    public static Node lca(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2) return root;
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);
        if(leftLca == null) return rightLca;
        if(rightLca == null) return leftLca;
        return root;
    }
    public static int minDistance(Node root, int n1, int n2){
        if(root == null) return -1;
        Node lca = lca(root, n1, n2);
        if(lca == null) return -1;
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca,n2);
        return dist1+dist2;
    }
    public static int lcaDist(Node lca, int n){
        if(lca == null) return -1;
        if(lca.data == n) return 0;
        int leftDist = lcaDist(lca.left, n);
        int rightDist = lcaDist(lca.right, n);
        if(leftDist == -1 && rightDist == -1) return -1;
        else if(leftDist == -1) return rightDist+1;
        else return leftDist+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(minDistance(root, 4, 7));
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.right = new Node(4);
        root2.left.right.right = new Node(5);
        root2.left.right.right.right = new Node(6);
        System.out.println(minDistance(root2, 6, 3));
    }
}
