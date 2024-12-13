package QueueImplementation;

class QueueArray {
    public static class Queue{
        public static int[] arr;
        public static int rear;
        static int size = 0;
        Queue(int n){
            arr = new int[n];
            rear = -1;
            size = n;
        }
        public boolean isEmpty(){
            return rear == -1;
        }
        public void add(int data){
            if (rear == size-1) {
                System.out.println("Queue is full");
            }
            rear++;
            arr[rear] = data;
            size++;
            return;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            size--;
            rear--;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}