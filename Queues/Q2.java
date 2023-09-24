package Queues;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        int len[]={4,3,2,6};
        int size = len.length;
        System.out.println(minCost(len, size));
    }
    public static int minCost(int arr[] , int n) {
        PriorityQueue<Integer>Pq=new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++) {
            Pq.add(arr[i]);
        }
        int res=0;
        while (Pq.size()>1) {
            int first = Pq.poll();
            int second = Pq.poll();
            res+=first+second;
            Pq.add(first+second);
        }
        return res;
    }
}
