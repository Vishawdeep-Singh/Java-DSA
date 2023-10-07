package Graphs;

public class Q5_Part_5 {
    public static void main(String[] args) {
        int N=5 , M=8;
        int[][] matrix = { { 0, 0, 0, 0, 0, 0, 0, 1 },{ 0, 1, 1, 1, 1, 0, 0, 1 },{ 0, 1, 0, 1, 0, 0, 0, 1 },{ 0, 1, 1, 1, 1, 0, 1, 0 },{ 0, 0, 0, 0, 0, 0, 0, 1 } };
        System.out.println(countIslands(matrix, N, M));
    }
    public static int countIslands(int mat[][],int N , int M){
        boolean vis[][]= new boolean[N][M];
        int result=0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(i!=0 &&j!=0 && i!=N-1 && j!=M-1 && vis[i][j]==false && mat[i][j]==1 ){
                    boolean hasCorner=false;
                    dfs(mat, i, j, N, M, vis, hasCorner);
                    if(!hasCorner){
                        result+=1;
                    }

                }
            }
        }
        return result;
    }
    static void dfs(int mat[][],int x , int y,int n,int m ,boolean vis[][],boolean hasCorner){
        if(x<0 || y<0 || x>=n || y>=m || mat[x][y]==0 || vis[x][y]==true){
            return;
        }

        if(x==0 || y==0 || x==n-1 || y==m-1){
            if(mat[x][y]==1){
                hasCorner=true;
            }
        }
        vis[x][y]=true;
        dfs(mat, x+1, y, n, m, vis, hasCorner);
        dfs(mat, x-1, y, n, m, vis, hasCorner);
        dfs(mat, x, y+1, n, m, vis, hasCorner);
        dfs(mat, x, y-1, n, m, vis, hasCorner);
    }
}
