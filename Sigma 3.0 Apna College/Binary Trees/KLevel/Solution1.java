package KLevel;

import java.util.LinkedList;
import java.util.Queue;

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
    public static void kLevel(Node root, int k){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        int lvl = 1;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null) {
                lvl++;
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                if (lvl == k) System.out.print(currNode.data+" ");
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
            }
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
        kLevel(root, 3);
    }
}
