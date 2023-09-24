package Graphs;
import java.util.*;

import Linked_List.LinkedList;
public class Q2_Part3 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Qitem{
        Node node;
        int depth;
        public  Qitem(Node node,int depth){
            this.node=node;
            this.depth=depth;
        }
    }
    static int minDepth(Node root){
        if (root==null) {
            return 0;
        }
        Queue<Qitem>q= new java.util.LinkedList<>();
        Qitem qi = new Qitem(root, 1);
        q.add(qi);

        while (!q.isEmpty()) {
          qi=q.peek();
          q.remove();
          Node node = qi.node;
          int depth = qi.depth;
          if (node.left==null && node.right==null) {
            return depth;
          }
          if (node.left!=null) {
            qi.node=node.left;
            qi.depth=depth+1;
            q.add(qi);
          }
          if (node.right!=null) {
            qi.node=node.right;
            qi.depth=depth+1;
            q.add(qi);
          }
            
        }
        return 0;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println(minDepth(root));
    }
}
