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
    }
}
