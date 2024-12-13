public class LinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data) {
//            step1 -> create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
//            step 2 -> newNode next = head => linking
        newNode.next = head;
//            step3 -> head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);

        if(tail == null){
//                the condition can also be head == null
            tail = head = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public static void print(){
        /*Prints a linked list*/
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is empyty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        int i = 0; Node temp = head;
        while(i<(index-1)){
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    public int removeFirst(){
        int value;
        if (size == 0){
            System.out.println("Empty LinkedList");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        value = head.data;
        head = head.next;
        size--;
        return value;
    }
    public int removeLast(){
        int value;
        if (size == 0){
            System.out.println("Empty LinkedList");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        value = tail.data;
        tail = temp;
        temp.next = null;
        size--;
        return value;

    }
    public static int iterativeSearch(int key){
        Node temp = head; int index = 0;
        while(temp.next != null){
            if(temp.data == key) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }
    public static int recursiveSearchHelper(Node head, int key){
        if(head == null) return -1;
        if(head.data == key) return 0;
        int idx = recursiveSearchHelper(head.next,key);
        if(idx == -1) return -1;
        else return idx+1;
    }
    public static int recursiveSearch(int key){
        return recursiveSearchHelper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthNodeFromEnd(int N){
        /*Deletes nth node in linked list from end after calculating size.
        * @param N = nth node from end*/
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        int i = 1;
        Node prev = head;
        while( i < (size - N)){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        this.size--;
        return;
    }
    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean isPalindrome(Node head){
        if(head == null || head.next == null) return true;
        Node mid = findMid(head);
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right != null){
            if(left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static boolean checkCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    public static void removeCycle(Node head){
       Node slow = head;
       Node fast = head;
       boolean cycle = false;
       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow == fast){
               cycle = true;
               break;
           }
       }
      if(cycle){
          slow = head;
          Node prev = null;
          while(slow != fast){
              slow = slow.next;
              prev = fast;
              fast = fast.next;
          }
          prev.next = fast;
      }
      else {
          throw new RuntimeException("CycleNotFound");
      }
    }
    private static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node leftHalf = mergeSort(head);
        Node rightHalf = mergeSort(rightHead);
        return merge(leftHalf,rightHalf);
    }
    private static Node merge(Node leftHalf, Node rightHalf){
        Node merged = new Node(-1);
        Node temp = merged;
        while(leftHalf != null && rightHalf != null){
           if(leftHalf.data <= rightHalf.data){
               temp.next = leftHalf;
               leftHalf = leftHalf.next;
               temp = temp.next;
           } else{
               temp.next = rightHalf;
               rightHalf = rightHalf.next;
               temp = temp.next;
           }
        }
        while(leftHalf!=null){
            temp.next = leftHalf;
            leftHalf = leftHalf.next;
            temp = temp.next;
        }
        while(rightHalf!=null){
            temp.next = rightHalf;
            rightHalf = rightHalf.next;
            temp = temp.next;
        }
       return merged.next;
    }
    public static void zigZag(Node head){
//        find mid and break linked list
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node midHead = mid.next;
        mid.next = null;
//        Reverse 2nd part of Linked List
        Node prev = null;
        Node curr = tail = midHead;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        midHead = prev;
//        Merge in Zig Zag
        Node tempHead; Node tempL; Node tempR = midHead;
        tempL = tempHead = head;
        while(tempHead != null && midHead != null){
//            Zig-Zag arrangement.
            tempHead = tempHead.next;
            tempL.next = tempR;
            midHead = midHead.next;
            tempR.next = tempHead;
//            Adaptation of temporary variables.
            tempL = tempHead;
            tempR = midHead;
        }
//        while(midHead.next != null){
//            midHead = midHead.next;
//            tempR.next = tempHead;
//            tempR = midHead;
//        }
    }
    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(9);
        head.next.next = new Node(8);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.next = new Node(3);
//        print();
//        head = mergeSort(head);
        print();
        zigZag(head);
        print();
    }

}










