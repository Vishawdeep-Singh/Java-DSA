package Heaps;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>(
            List.of(4, 6, 3, 9, 10, 2)
        );
        System.out.println(minOps(nums));

    }
    static int minOps(ArrayList<Integer>nums){
        int sum=0;
        for (int i = 0; i < nums.size(); i++) {
            sum+=nums.get(i);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.size(); i++) {
            pq.add(nums.get(i));
        }
        double temp =sum;
        int cnt=0;
        while (temp>sum/2) {
            int x = pq.peek();
            pq.remove();
            temp=temp-Math.ceil(x*1.0/2);
            pq.add(x/2);
            cnt++;
        }
        // for (int i = 0; i <pq.size(); i++) {
        //     System.out.print(pq.peek()+" ");
        //     pq.remove();
        // }
        return cnt;
    }
}
