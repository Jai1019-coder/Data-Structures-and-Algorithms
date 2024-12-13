package Height;

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
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,5,6,7,-1,3,-1};
        Node rootNode = BinaryTrees.buildTee(nodes);
        // System.out.println(rootNode.data);
        System.out.println(BinaryTrees.height(rootNode));
    }
}
