package Job_Sequencing;

import java.util.ArrayList;

import java.util.Collections;

public class Solution {
    static class Job{
        char job;
        int deadline;
        int profit;

        public Job(int i, int d, int p){
            job = (char)(65+i);
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int Jobs[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> job = new ArrayList<>();
        for (int i = 0; i < Jobs.length; i++) {
            job.add(new Job(i, Jobs[i][0],Jobs[i][1]));
        }
        Collections.sort(job, (obj1,obj2) -> obj2.profit-obj1.profit);//descending order

        ArrayList<Character> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < Jobs.length; i++) {
            Job curr = job.get(i);
            if (curr.deadline > time) {
                seq.add(curr.job);
                time++;
            }
        }
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i));
        }
    }
}
