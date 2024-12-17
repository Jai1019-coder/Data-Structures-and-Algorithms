import java.util.ArrayList;

public class HeapImplementation {
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;//child index
            int parent = (x-1)/2;//parent index

            while(arr.get(x)<arr.get(parent)){//swapping
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
            }
        }
        public int peek(){
            return arr.get(0);
        }
        public int remove(){
            // step 1 swap first and last node elements
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // remove the last emelent
            arr.remove(arr.size()-1);

            // heapify
            heapify(0);
            return temp;
        }
        private void heapify(int idx){
            int leftChild = 2*idx+1;
            int rightChild = 2*idx+2;
            int minIdx = idx;
            if(leftChild < arr.size() && arr.get(leftChild) < arr.get(minIdx)){
                minIdx = leftChild;
            }
            if(rightChild < arr.size() && arr.get(rightChild) < arr.get(minIdx)){
                minIdx = rightChild;
            }
            if (minIdx != idx) {
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        public boolean isEmpty(){
            return arr.isEmpty();
        }
    }
    public static void main(String[] args) {
        heap h = new heap();
        h.add(5);
        h.add(6);
        h.add(10);
        h.add(4);
        h.add(2);
        while (!h.isEmpty()) {
            System.out.println(h.remove());
        }
    }
}
