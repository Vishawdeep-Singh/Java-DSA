package Hashing;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
     int result[]=twoSum(arr, target);
     for (int i = 0; i < result.length; i++) {
        System.out.println(result[i]);
     }
    }
    public static int[] twoSum(int arr[],int target){
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff=target-arr[i];

            if (map.containsKey(diff)) {
                return new int[] {i,map.get(diff)};
            }
            map.put(arr[i], i);
        }
        return new int[]{0,0};
    }
}
