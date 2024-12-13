package QueueImplementation;
public class CircularQueueArray {
    public static class Queue_{
        public static int[] arr;
        public static int rear;
        static int front;
        static int size = 0;
        Queue_(int n){
            arr = new int[n];
            front = rear = -1;
            size = n;
        }
        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        boolean isFull(){
            return (rear+1)%size == front;
        }
        public void add(int data){
            if (isFull()) {
                System.out.println("Queue is full");
            }
            rear = (rear+1)%size;
            arr[rear] = data;
            if(front == -1){
                front = 0;
            }
            size++;
            return;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            // last element remove
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front+1)%size;
            }
            size--;
            return result;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue_ q = new Queue_(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
