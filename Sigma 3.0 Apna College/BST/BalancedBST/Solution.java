package BalancedBST;

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
    public static Node balancedBST(int arr[], int start,int end){
        if(start > end ) return null;
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = balancedBST(arr, start, mid-1);
        root.right = balancedBST(arr, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int values[] = {1,2,3,4,5,6,7,8,9,10};
        Node root = balancedBST(values,0,values.length-1);
        preorder(root);
    }
}
