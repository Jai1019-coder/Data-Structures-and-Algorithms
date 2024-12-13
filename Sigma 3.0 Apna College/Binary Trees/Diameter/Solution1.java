package Diameter;

public class Solution1 {
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
    static class BinaryTrees{
        static int index = -1;
        public static Node buildTee(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTee(nodes);
            newNode.right = buildTee(nodes);
            return newNode;
        }
        public static int height(Node root){
            if(root == null) return 0;
            int leftHeight = 1+height(root.left);
            int rightHeight = 1+height(root.right);
            return Math.max(leftHeight, rightHeight);
        }
        public static int diameter(Node root){
            if (root == null) {
                return 0;
            }
            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int selfDiameter = leftHeight+rightHeight+1;
            return Math.max(selfDiameter, Math.max(rightDiameter,leftDiameter));
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(BinaryTrees.diameter(root));
    }
}
