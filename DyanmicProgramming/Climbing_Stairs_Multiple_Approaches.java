package DyanmicProgramming;

import java.util.Arrays;

public class Climbing_Stairs_Multiple_Approaches {
    public static void main(String[] args) {
        int n=5;
        int ways[]=new int [n+1];
        Arrays.fill(ways, -1);
        // System.out.println(ways(n));
        // System.out.println(ways_Memo(n, ways));
        System.out.println(waysTab(n));
    }



public static int ways(int n){
if (n==0) {
    return 1;
}
if (n<0) {
    return 0;
}
return ways(n-1)+ways(n-2);
}

public static int ways_Memo(int n , int ways[]){
    if (n==0) {
        return 1;
    }
    if (n<0) {
        return 0;
    }
    if (ways[n]!=-1) {
        return ways[n];
    }
    ways[n]=ways_Memo(n-1, ways)+ways_Memo(n-2, ways);
    return ways[n];
}
public static int waysTab(int n){
    int dp[]=new int[n+1];
    dp[0]=1;
    for (int i = 1; i <=n; i++) {
        if(i==1){
            dp[i]=dp[i-1];
        }
        else{
        dp[i]=dp[i-1]+dp[i-2];
        }
    }
    return dp[n];
}
}
