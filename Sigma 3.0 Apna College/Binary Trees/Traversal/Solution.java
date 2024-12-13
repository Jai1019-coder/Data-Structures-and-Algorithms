package Traversal;
import java.util.*;

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
        public static void preorder(Node root){
            if(root == null){
                // System.out.print(-1+" ");
                return;
            };
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root == null) return;
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root == null) return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(Node root){
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else q.add(null);
                }else{
                    System.out.print(currNode.data+" ");
                    if (currNode.left!=null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right!=null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node rootNode = BinaryTrees.buildTee(nodes);
        BinaryTrees.preorder(rootNode);
        System.out.println();
        BinaryTrees.inorder(rootNode);
        System.out.println();
        BinaryTrees.postorder(rootNode);
        System.out.println();
        BinaryTrees.levelorder(rootNode);
    }
}
