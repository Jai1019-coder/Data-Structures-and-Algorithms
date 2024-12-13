import java.util.ArrayList;
public class PrintReverseAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.print(max);
    }
}
