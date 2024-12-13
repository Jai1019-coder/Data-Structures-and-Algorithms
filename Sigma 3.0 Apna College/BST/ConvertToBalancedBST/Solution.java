package ConvertToBalancedBST;

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
    public static void preorder(Node root){
        if(root == null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node toBalancedBST(Node root){
        ArrayList<Node> arr = new ArrayList<>();
        arr = inorder(root, arr);
        return balancedBST(arr,0,arr.size()-1);
    }
    public static Node balancedBST(ArrayList<Node> arr, int start, int end){
        if(start > end) return null;
        int mid = (start+end)/2;
        Node root = new Node(arr.get(mid).data);
        root.left = balancedBST(arr,start, mid-1);
        root.right = balancedBST(arr, mid+1, end);
        return root;
    }
    public static ArrayList<Node> inorder(Node root, ArrayList<Node> arr){
        if(root == null){
            return arr;
        }
        inorder(root.left, arr);
        arr.add(root);
        inorder(root.right, arr);
        return arr;
    }
    public static void inorderprint(Node root){
        if(root == null) return ;
        inorderprint(root.left);
        System.out.print(root.data+" ");
        inorderprint(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left  = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        preorder(root);
        System.out.println();
        root = toBalancedBST(root);
        preorder(root);
    }
}

