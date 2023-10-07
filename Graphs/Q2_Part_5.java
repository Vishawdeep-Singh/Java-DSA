package Graphs;
import java.util.*;
public class Q2_Part_5 {
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



  
   public static int find(int par[],int i) {
    if (i==par[i]) {
        return i;
    }
    return find(par,par[i]);
   }
   public static void union(int par[],int a,int b){
    par[a]=b;
   }
   public static void createGraph(ArrayList<Edge>graph[]){
    for (int i = 0; i <graph.length; i++) {
        graph[i]=new ArrayList<Edge>();
     }
     
    

    graph[0].add(new Edge(0, 1, 1));
    // graph[0].add(new Edge(0, 2, 1));
    // graph[1].add(new Edge(1, 0, 1));
    // graph[1].add(new Edge(1, 2, 1));
    // graph[2].add(new Edge(2, 0, 1));
    // graph[2].add(new Edge(2, 1, 1));

    
    }
    static int isCycle(ArrayList<Edge>graph[],int V){
      int parent[]=new int[V];
      for (int i = 0; i < V; i++) {
        parent[i]=i;
      }
      for (int i = 0; i < graph.length; i++) {
        for (int j = 0; j < graph[i].size(); j++) {
            Edge e = graph[i].get(j);
            int x = find(parent,e.src);
            int y = find(parent,e.dest);
            if (x==y) {
                return 1;
            }
            union(parent,x, y);
        }
      }
      return 0;
    }
    public static void main(String[] args) {
        int V=2;
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph);
       
        System.out.println(isCycle(graph,V));
    }

}
