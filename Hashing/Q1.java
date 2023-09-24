package Hashing;
import java.util.*;
public class Q1 {
   static class Node{
        int data;
        int hd;
        Node left ,right;
        public Node(int data){
            this.data=data;
            this.hd=Integer.MAX_VALUE;
            this.left=this.right=null;
        }
      
        }
        public static void bottomview(Node root){
            if (root==null) {
                return;
            }
            int hd=0;
            HashMap<Integer,Integer>map= new HashMap<>();
            Queue<Node>q=new LinkedList<>();
            root.hd=hd;
            q.add(root);

            while (!q.isEmpty()) {
                Node temp=q.remove();
                hd=temp.hd;
                map.put(hd, temp.data);

                if (temp.left!=null) {
                    temp.left.hd=hd-1;
                    q.add(temp.left);
                }
                if (temp.right!=null) {
                    temp.right.hd=hd+1;
                    q.add(temp.right);
                }
            }

            System.out.println(map);
            
        }
    
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        bottomview(root);
    }
}
