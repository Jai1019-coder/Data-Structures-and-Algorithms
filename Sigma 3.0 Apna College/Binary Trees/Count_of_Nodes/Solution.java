package Count_of_Nodes;

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
        public static int countNodes(Node root){
            if(root == null) return 0;
            // if(root.right == null && root.left == null) return 1;
            return countNodes(root.left)+countNodes(root.right)+1;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node rootNode = BinaryTrees.buildTee(nodes);
        // System.out.println(rootNode.data);
        System.out.println(BinaryTrees.countNodes(rootNode));
    }
}
