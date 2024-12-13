import java.util.LinkedList;
public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> lt = new LinkedList<>();
        lt.addLast(1);
        lt.addLast(2);
        lt.addFirst(0);
        lt.addFirst(-1);
        System.out.println(lt);
        lt.removeLast();
        lt.removeFirst();
        System.out.println(lt);
    }
}
