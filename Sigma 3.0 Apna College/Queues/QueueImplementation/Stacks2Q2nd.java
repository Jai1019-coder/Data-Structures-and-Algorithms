package QueueImplementation;

import java.util.Stack;

public class Stacks2Q2nd {
    static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        // add
        void add(int data){
            s1.push(data);
        }
        int remove(){
            if (s1.isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int element = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return element;
        }
        boolean isEmpty(){
            return s1.isEmpty();
        }
        int peek(){
            if (s1.isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int element = s2.peek();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return element;
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
