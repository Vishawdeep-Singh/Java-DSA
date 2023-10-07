package Graphs;
import java.util.*;
public class Q1_Part_5 {
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
    public static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0; i <graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
         }
         
         graph[0].add(new Edge(0, 2, 1));
         graph[0].add(new Edge(0, 3, 1));

         graph[1].add(new Edge(1, 0, 1));
        

       
         graph[2].add(new Edge(2, 1, 1));

         graph[3].add(new Edge(3, 4, 1));
         

        
        }
        public static int motherVertex(ArrayList<Edge>graph[],int V){
            boolean vis[]= new boolean[V];
            int v=-1;
            for (int i = 0; i < V; i++) {
                if(!vis[i]){
                    dfs(graph, i, vis);
                    v=i;

                }
            }
            boolean check[]=new boolean[V];
            dfs(graph, v, check);

            for (boolean b : check) {
                if(!b){
                    return -1;

                }
            }
            return v;
        }
        public static void dfs(ArrayList<Edge>graph[],int curr , boolean vis[]) {
            vis[curr]=true;

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e =  graph[curr].get(i);
                if(!vis[e.dest]){
                    dfs(graph, e.dest, vis);
                }
            }
        }
        public static void main(String[] args) {
            int V=5;
            ArrayList<Edge>graph[]=new ArrayList[V];
            createGraph(graph);
            System.out.println(motherVertex(graph, V));
        }
}
