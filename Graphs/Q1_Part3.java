package Graphs;
import java.util.*;

public class Q1_Part3 {
    // public static void main(String arg[])
    // {
   
    //   int V = 5;
    //   @SuppressWarnings("unchecked")
    //   ArrayList <Integer> adj[] = new ArrayList[V];
    //   for(int i = 0; i < 5; i++)
    //     adj[i] = new ArrayList<Integer>();
   
    //   addEdge(adj, 0, 1);
    //   addEdge(adj, 0, 2);
    //   addEdge(adj, 0, 3);
      
    //   addEdge(adj, 1, 0);
    //   addEdge(adj, 1, 2);
    //   addEdge(adj, 2, 1);
    //   addEdge(adj, 2, 0);
    //   addEdge(adj, 3, 4);
    //   addEdge(adj, 4, 3);
   
    //   if (isCyclicDisconntected(adj, V))
    //     System.out.println("Yes");
    //   else
    //     System.out.println("No");
    // }
   
    // static void addEdge(ArrayList<Integer> adj[], int u, int v)
    // {
    //   adj[u].add(v);
    //   adj[v].add(u);
    // }
   
    // static boolean isCyclicConntected(
    //                            ArrayList<Integer> adj[], int s,
    //                                   int V, boolean visited[])
    // {
   
    //   // Set parent vertex for every vertex as -1.
    //   int parent[] = new int[V];
    //   Arrays.fill(parent, -1);
   
    //   // Create a queue for BFS
    //   Queue<Integer> q = new LinkedList<>();
   
    //   // Mark the current node as
    //   // visited and enqueue it
    //   visited[s] = true;
    //   q.add(s);
   
    //   while (!q.isEmpty())
    //   {
   
    //     // Dequeue a vertex from
    //     // queue and print it
    //     int u = q.poll();
    //    System.out.println(u);
   
    //     // Get all adjacent vertices
    //     // of the dequeued vertex u.
    //     // If a adjacent has not been
    //     // visited, then mark it visited
    //     // and enqueue it. We also mark parent
    //     // so that parent is not considered
    //     // for cycle.
    //     for (int i = 0; i < adj[u].size(); i++)
    //     {
    //       int v = adj[u].get(i);
        
         
    //       if (!visited[v])
    //       {
    //         visited[v] = true;
    //         q.add(v);
    //         parent[v] = u;
    //       }
    //       else if (parent[u] != v)
    //         return true;
    //     }
    //   }
    //   return false;
    // }
   
   
    // static boolean isCyclicDisconntected(
    //                      ArrayList<Integer> adj[], int V)
    // {
   
    //   // Mark all the vertices as not visited
    //   boolean visited[] = new boolean[V];
    //   Arrays.fill(visited,false);
   
    //   for (int i = 0; i < V; i++)
    //     if (!visited[i] &&
    //         isCyclicConntected(adj, i, V, visited))
    //       return true;
    //   return false;
    // }
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
    static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0; i <graph.length; i++) {
            graph[i]=new ArrayList<>();
         }
         graph[0].add(new Edge(0, 1, 1));
        //  graph[0].add(new Edge(0, 2, 1));
         graph[0].add(new Edge(0, 3, 1));

         graph[1].add(new Edge(1, 0, 1));
        //  graph[1].add(new Edge(1, 2, 1));

        //  graph[2].add(new Edge(2, 0, 1));
        //  graph[2].add(new Edge(2, 1, 1));

         graph[3].add(new Edge(3, 0, 1));
         graph[3].add(new Edge(3, 4, 1));
         

         graph[4].
         add(new Edge(4, 3, 1));
        
        }
        public static void main(String[] args) {
            int V=5;
            ArrayList<Edge>graph[]=new ArrayList[V];
            createGraph(graph);
            System.out.println(detectCycle(graph,V));
        }
        public static boolean detectCycle(  ArrayList<Edge>graph[],int V) {
            int parent[] = new int[10];
       Arrays.fill(parent, -1);
       boolean vis[]=new boolean[V];
       Queue<Integer>q=new LinkedList<>();
       q.add(0);

       vis[0]=true;
       while (!q.isEmpty()) {
        int curr = q.remove();

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[e.dest]=true;
                q.add(e.dest);
                parent[e.dest]=e.src;
            }
            else if (parent[e.src]!=e.dest) {
                return true;
            }
        }
       }
       return false;
        }
  }   
