package DyanmicProgramming;

import java.util.Arrays;

public class Matrix_Chain_Multiplication {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n = arr.length;
        // System.out.println(mcm(arr, 1, n-1));
    //     int dp[][] =new int[n][n];
    //     for (int i = 0; i < n; i++) {
    //         Arrays.fill(dp[i], -1);
    //     }
    //    System.out.println(mcm_Memo(arr, 1, n-1, dp));
    System.out.println(mcm_Tab(arr));
    }
    public static int mcm(int arr[] , int i , int j) {
        if (i==j) {
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for (int k = i; k <=j-1; k++) {
            int cost1=mcm(arr, i, k);
            int cost2=mcm(arr, k+1, j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalcost=cost1+cost2+cost3;
            ans=Math.min(ans, finalcost);
        }
        return ans;
    }
    public static int mcm_Memo(int arr[] , int i , int j, int dp[][]) {
        if (i==j) {
            return 0;
        }
        if (dp[i][j]!=-1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <=j-1; k++) {
            int cost1=mcm_Memo(arr, i, k, dp);
            int cost2=mcm_Memo(arr, k+1, j , dp);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalcost=cost1+cost2+cost3;
            ans=Math.min(ans, finalcost);
        }
        return dp[i][j]=ans;
    }
    public static int mcm_Tab(int arr[]) {
        int n = arr.length;
        int dp[][]=new int[n][n];
        // initialization
        for (int i = 0; i < n; i++) {
            dp[i][i]=0;
        }
        // bottom-up
        for (int len = 2; len <= n-1; len++) {
            for (int i = 1; i <= n-len; i++) {
                int j = i+len-1;
                dp[i][j]=Integer.MAX_VALUE;
                for (int k = i; k <=j-1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[j]*arr[k];
                    dp[i][j]=Math.min(cost2+cost3+cost1, dp[i][j]);
                }
            }
        }
        
        return dp[1][n-1];

    }
}
