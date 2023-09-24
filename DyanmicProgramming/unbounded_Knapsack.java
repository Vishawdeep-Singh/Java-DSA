package DyanmicProgramming;

public class unbounded_Knapsack {
    public static void main(String[] args) {
        int val[]= {15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.println(unboundedknapsackTab(val, wt, W));
    }
    public static int unboundedknapsackTab(int val[], int wt[], int W) {
        int n= val.length;
        int dp[][]=new int[n+1][W+1];
        for (int i = 0; i < dp.length; i++) { //0th col
            dp[i][0]=0;
        }
        for (int j = 0; j < dp[0].length; j++) { //0th row
            dp[0][j]=0;
        }

        for (int i = 1 ;i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {
                int v= val[i-1];//ith item value
                int w= wt[i-1]; //ith item weight
                if (w<=j) {
                    int incProfit= v + dp[i][j-w]; 
                    int excProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit, excProfit);
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
            
        }
        return dp[n][W];

    }
}
