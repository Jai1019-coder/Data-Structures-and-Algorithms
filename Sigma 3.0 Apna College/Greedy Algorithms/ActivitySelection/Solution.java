package ActivitySelection;

public class Solution {
    public static void main(String[] args) {
        int start[] = {1,2,0,5,8,3};
        int end[] = {2,3,6,7,9,9};
        int maxAct = 1;
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum activites = "+maxAct);
    }
}