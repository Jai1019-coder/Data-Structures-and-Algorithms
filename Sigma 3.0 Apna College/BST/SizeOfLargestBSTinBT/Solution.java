package SizeOfLargestBSTinBT;

public class Solution {
    static class Node{
        Node left;
        int data;
        Node right;
        Node(int data){
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;
    public static Info largestBST(Node root){
        if(root == null ){
            return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size+1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max,rightInfo.max));
        if(root.data <= leftInfo.min || root.data >= rightInfo.max){
            return new Info(false,size,min,max);
        }else if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(leftInfo.size, rightInfo.size);
            return new Info(true, size, min, max);
        }else{
            return new Info(false, size, min, max);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        largestBST(root);
        System.out.println(maxBST);
    }
}