public class wewew {
    class Solution {
        public static void main(String[] args) {
            String s="horse";
            String t="ros"; 
            System.out.println(editDistance(s, t));
        }
        public static int editDistance(String s, String t) {
           
           int dp[][] = new int[s.length()][t.length()];
          
          return solve(s,t,0,0,dp);
    }
    public static int solve(String a, String b,int i, int j ,int dp[][] ){
        if(i==a.length()){
            return b.length()-j;
        }
        if(j==b.length()){
            return a.length()-i;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int ans=0;
        if(a.charAt(i)==b.charAt(j)){
            return solve(a,b,i+1,j+1,dp);
        }
        else{
            System.out.println("Insert");
            int insert=1+solve(a,b,i,j+1,dp);
            System.out.println("Delete");
            int delete=1+solve(a,b,i+1,j,dp);
            System.out.println("Replace");
            int replace = 1+solve(a,b,i+1,j+1,dp);
            System.out.println("Min is called");
            ans=Math.min(insert,Math.min(delete,replace));
        }
        return dp[i][j]=ans;
    }
    }
}
