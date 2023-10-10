package Graphs;
import java.util.*;
public class Q3_Part_5 {
    static class Edge{
        int src;
        int dest;
        int wt;


        public Edge(int s , int d , int w){
            this.src=s;
            this.dest=d;
            this.wt=w;

        }
    }
    public static void main(String[] args) {
        int V = 4;
        int tasks[][]={{1,0},{2,1},{3,2}};
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph,tasks);
        System.out.println(!isCycle(graph));
    }
    public static void createGraph(ArrayList<Edge>graph[], int tasks[][]){
        for (int i = 0; i <graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
         }
         for (int i = 0; i < tasks.length; i++) {
            
                 graph[tasks[i][1]].add(new Edge(tasks[i][1], tasks[i][0], 1));
            
         }
         
        
    
       
        
        }
        public static boolean isCycle(ArrayList<Edge>[] graph){
            boolean vis[]=new boolean[graph.length];
            boolean stack[]=new boolean[graph.length];

            for (int i = 0; i < graph.length; i++) {
                if (!vis[i]) {
                   if( isCycleUtil(graph,i,vis,stack)){
                    return true;
                   }
                }   
            }
            return false;
        }
        public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr,boolean vis[],boolean stack[]){
            vis[curr]=true;
            stack[curr]=true;

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (stack[e.dest]) {
                    return true;
                }
                if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                    return true;
                }

            }
            stack[curr]=false;
            return false;

        }
}
