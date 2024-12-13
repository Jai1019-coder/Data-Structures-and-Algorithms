package QueueImplementation;

public class QueueLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class Queue{
        Node head = null;
        Node tail = null;
        boolean isEmpty(){
            return head == null && tail == null;
        }
        void add(int data){
            Node newNode = new Node(data);
            if (head == null && tail == null) {
                head = tail = newNode;
                return;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        int remove(){
            if (isEmpty()) {
                System.out.println("Queue is full");
                return -1;
            }
            int result = head.data;
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return result;
        }
        int peek(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }
    public void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
