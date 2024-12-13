package Dq2Stack;

import java.util.*;

public class Solution1 {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();
        boolean isEmpty(){
            return dq.isEmpty();
        }
        void push(int data){
            dq.addLast(data);
        }

        int pop(){
            return dq.removeLast();
        }
        int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        try {
            System.out.println(s.peek());
        } catch (NoSuchElementException e) {
            // TODO: handle exception
            System.out.println(-1);
        }
    }
}
