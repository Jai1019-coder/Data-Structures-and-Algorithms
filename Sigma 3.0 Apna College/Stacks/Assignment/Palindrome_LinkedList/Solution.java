package Assignment.Palindrome_LinkedList;

public class Solution {
    static class LinkedList{
        public static class Node{
            int val;
            Node next;
            public Node(int data){
                this.val = data;
                this.next = null;
            }
        }
        public static Node head = null;
        public static Node tail = null;
        
        boolean isEmpty(){
            return head == null && tail == null;
        }
        void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head.next;
            head = newNode;
        }
        void addLast(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail=head=newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
    }
    public static void main(String[] args) {
        LinkedList lt = new LinkedList();

    }
}
