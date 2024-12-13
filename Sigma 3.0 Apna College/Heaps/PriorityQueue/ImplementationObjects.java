package PriorityQueue;

import java.util.PriorityQueue;

public class ImplementationObjects {
    static class Student implements Comparable<Student>{
        int rollno;
        int rank;
        Student(int rollno, int rank){
            this.rollno = rollno;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student(231, 3));
        pq.add(new Student(345, 1));
        pq.add(new Student(677, 2));
        while (!pq.isEmpty()) {
            System.out.print(pq.peek().rollno+" ");
            pq.remove();
        }
    }
}
