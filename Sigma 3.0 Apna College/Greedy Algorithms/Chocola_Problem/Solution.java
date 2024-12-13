package Chocola_Problem;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // int n = 4,m = 6;
        Integer costHor[] = {4,1,2};//n-1
        Integer costVer[] = {2,1,3,1,4};//m-1
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());
        int hp = 1, vp = 1, h = 0, v = 0, cost = 0;
        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {//horizontal cut
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }else{//vertical cut
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        while(v < costVer.length ){
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println(cost);
    }
}
