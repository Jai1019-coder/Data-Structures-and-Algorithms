 public class ToweOfHanoi {
    static int totalDisk = 3;
    static int towerOfHanoi(char src, char dest, char aux, int n,int count){
        if(n == 0) return count;
        towerOfHanoi(src, aux,dest,n-1,count);
        count++;
        System.out.println(totalDisk-n+1+" move from "+src+" to "+dest);
        towerOfHanoi(aux, dest, src, n-1,count);
        return count;
    }
     public static void main(String[] args) {
        System.out.println(towerOfHanoi('A','C','B',3, 0));
    }
}
