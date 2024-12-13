public class OddEvenLinkedList {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if(head == null||  head.next == null || head.next.next == null){
                return head;
            }
            ListNode tempHead = head;
            ListNode ptrOdd = head;
            ListNode ptrEven = head.next;
            // adding odd nodes
            while(ptrOdd.next != null){
                ptrOdd = ptrOdd.next.next;
                if(ptrOdd != null){
                    tempHead.next = ptrOdd;
                    tempHead = ptrOdd;
                }
            }
            // adding even nodes
            while(ptrEven.next != null){
                tempHead.next = ptrEven;
                ptrEven = ptrEven.next.next;
                tempHead = ptrEven;
            }
            return head;
        }

        public static void main(String[] args) {

            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            head.next.next.next.next.next = new ListNode(6);
            head.next.next.next.next.next.next = new ListNode(7);
            head.next.next.next.next.next.next.next = new ListNode(8);
            Solution obj = new Solution();
            ListNode ans = obj.oddEvenList(head);
            while(ans != null){
                System.out.print(ans.val + " ");
                ans = ans.next;
            }
        }
    }

}
