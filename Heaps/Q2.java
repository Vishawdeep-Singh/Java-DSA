package Heaps;
import java.util.*;
public class Q2 {
   public static void main(String[] args) {
    int N=6;
    int arr[]={2,6};
    int k=arr.length;
minTime(arr, N, k);
   } 

   public static void minTime(int arr[] ,int N , int k) {
    Queue<Integer>q=new LinkedList<>();
    boolean vis[]=new boolean[N+1];
    int time=0;

    for (int i = 0; i < k; i++) {
        q.add(arr[i]);
        vis[arr[i]]=true;
    }
    while (!q.isEmpty()) {
        for (int i = 0; i < q.size(); i++) {
            int curr=q.poll();
            if (curr-1>=1&&!vis[curr-1]) {
                vis[curr-1]=true;
                q.add(curr-1);
            }
            if (curr+1<=N && !vis[curr+1]) {
                vis[curr+1]=true;
                q.add(curr+1);
            }

        }
        time++;
    }
    System.out.println(time-1);
   }
}
