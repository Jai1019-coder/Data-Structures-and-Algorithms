package RootToLeafPath;

import java.util.ArrayList;

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
    public static void rootToLeafPath(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        path(root, arr);
    }
    public static void path(Node root, ArrayList<Integer> arr){
        if(root == null) return;
        
        arr.add(root.data);
        if(root.left == null && root.right ==null){
            // arr.add(root.data);
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i)+"->");
            }
            System.out.print("null");
            System.out.println();
        }
        if(root.left != null || root.right !=null){
            arr.add(root.data);
        }
        path(root.left, arr);
        path(root.right, arr);
        arr.removeLast();
    }
    public static void main(String[] args) {
        int values[] = {8,5,10,3,6,11,14,4,1};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        rootToLeafPath(root);
    }
}
