package MirroringBST;

public class Solution {
    
    static class Node{
        Node left;
        int data;
        Node right;
        public Node(int data){
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.data){
            root.left=insert(root.left, val);
        }
        else if(val>root.data){
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void preorder(Node root){
        if(root == null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void mirroring(Node root){
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirroring(root.left);
        mirroring(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        preorder(root);
        mirroring(root);
        System.out.println();
        preorder(root);
    }
}
