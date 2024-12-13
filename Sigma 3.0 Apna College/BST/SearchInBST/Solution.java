package SearchInBST;

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
    public static void inorder(Node root){
        if(root == null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node searchBST(Node root, int key){
        if(root == null){
            return null;
        }
        if(root.data == key) return root;
        else if(key < root.data){
            return searchBST(root.left, key);
        }else{
            return searchBST(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        Node keyRoot = searchBST(root, 6);
        try {
            System.out.println(keyRoot.data);
        } catch (NullPointerException e) {
            System.out.println("Element not found");
        }
    }
}
