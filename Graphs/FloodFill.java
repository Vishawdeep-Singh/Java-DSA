package Graphs;

public class FloodFill {
    public void helper(int[][] image , int sr , int sc,int color,boolean vis[][],int orgcolor ){
        if(sr<0 ||  sc<0 || sr>image.length || sc>image[0].length || vis[sr][sc] || image[sr][sc]!=orgcolor){
            return;
        }
        helper(image, sr, sc-1, color, vis, orgcolor);
        helper(image, sr, sc+1, color, vis, orgcolor);
        helper(image, sr-1, sc, color, vis, orgcolor);
        helper(image, sr+1, sc, color, vis, orgcolor);

    }
    public int[][] floodFill(int[][] image , int sr , int sc,int color){
        boolean vis[][]=new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, color);
        return image;
    }
    public static void main(String[] args) {
        
    }
}
