package Graphs;
import java.util.*;

    //{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
     static class Edge{
        int src;
        int dest;
      


        public Edge(int s , int d){
            this.src=s;
            this.dest=d;
          

        }
    }
    public String findOrder(String [] dict, int N, int K)
    {
        
        int V=K;
         ArrayList<Edge>graph[]=new ArrayList[V];
         createGraph(dict,V,graph);
         return topSort(graph,K);
        
    }
    static void createGraph(String [] dict, int V,ArrayList<Edge>graph[]){
        for(int i=0 ; i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0 ; i<dict.length-1;i++){
           String s1 = dict[i];
           String s2 = dict[i+1];
            int minLength = Math.min(s1.length(), s2.length());
           for(int j=0 ; j<minLength;j++ ){
               if(s1.charAt(j)!=s2.charAt(j)){
                   graph[s1.charAt(j)-'a'].add(new Edge(s1.charAt(j)-'a',s2.charAt(j)-'a'));
                   break;
               }
           }
        }
        
    }
    public static String topSort(ArrayList<Edge>[]graph,int K){
        String result="";
        boolean vis[]=new boolean[K];
        Stack<Integer>s=new Stack<>();

        for (int i = 0; i < K; i++) {
            if (!vis[i]) {
                topSortUtil(graph,i,vis,s);
            }
        }
        while (!s.isEmpty()) {
            result+=(char)('a'+ s.pop());
        }
        return result;
    }
    public static void topSortUtil(ArrayList<Edge>[] graph , int curr , boolean vis[],Stack<Integer>s){
        vis[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, e.dest   , vis, s);
            }
        }
        s.push(curr);


    }
    
}

