public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;
//    add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
//    print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
//    remove
    public int removeFirst(){
        if(head == null){
            System.out.println("Empty Doubly LinkedList");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
//    addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        size++;
        return;
    }
//    remove last
    public int removeLast(){
        if(head == null && tail == null){
            System.out.println("Empty Doubly LinkedList");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
       Node temp = head.next;
        while(temp.next != null){
            temp = temp.next;
        }
        int val = tail.data;
        tail = temp.prev;
        tail.next = null;
        size--;
        return val;
    }
    public void reverse(){
        Node previous = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = previous;
            curr.prev = next;
            previous = curr;
            curr = next;
        }
        head = previous;
    }
    public static void main(String[] args) {
        DoublyLinkedList dlt= new DoublyLinkedList();
        dlt.addFirst(5);
        dlt.addFirst(4);
        dlt.addFirst(3);
        dlt.addFirst(2);
        dlt.addFirst(1);
        dlt.print();
//        dlt.print();
//        System.out.println(dlt.size);
//        dlt.addLast(6);
//        dlt.print();
//        System.out.println(dlt.size);
//        dlt.removeLast();
//        dlt.print();
//        System.out.println(dlt.size);
        dlt.reverse();
        dlt.print();
    }
}
