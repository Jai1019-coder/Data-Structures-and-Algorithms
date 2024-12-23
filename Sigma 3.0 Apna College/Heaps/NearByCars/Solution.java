package NearByCars;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static class Car{
        String name;
        int[] position;
        int distsq;
        Car(String name, int[] position){
            this.name = name;
            this.position = position;
            this.distsq = ((position[0])*(position[0])+(position[1])*(position[1]));
        }
    }
    public static List<Car> carsNearby(int[][] pts, int k){
        ArrayList<Car> car = new ArrayList<>();
        for(int i = 0; i < pts.length; i++){
            car.add(new Car("C"+i,pts[i]));
        }
        // Sorting objects of Car on the basis of distsq
        Collections.sort(car,Comparator.comparingInt(o -> o.distsq));
        return car.subList(0, k);
    }
    public static void main(String[] args) {
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        List<Car> carsNear = new ArrayList<>();
        carsNear = carsNearby(pts, k);
        for (int i = 0; i < carsNear.size(); i++) {
            System.out.print(carsNear.get(i).name+" ");
        }
    }
}
