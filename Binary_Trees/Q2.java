package Binary_Trees;
import java.sql.RowId;
import java.util.*;
public class Q2 {
    
    
        
      
    }
    // public static Node mirror(Node root) {
    //    if (root==null) {
    //     return root;
    //    }
    //    Node left=mirror(root.left);
    //    Node right=mirror(root.right);

    //    root.left=right;
    //    root.right=left;

    //    return root;
       


    // }
    // public static void inOrder(Node root) {
    //     if (root==null) {
    //         return;
    //     }
    //     inOrder(root.left);
    //     System.out.print(root.data+" ");
    //     inOrder(root.right);
    // }

   class Solution{
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
        Node root;
       public  void mirror(){
            root=mirror(root);

        }
       public static Node mirror(Node node){
            if (node==null) {
               return node; 
            }
            Node left = mirror(node.left);
            Node right= mirror(node.right);
             node.left=right;
             node.right=left;

             return node;

      
             }
           public   void inOrder(){
                inOrder(root);
             }
          public  static void inOrder(Node node){
                if (node==null) {
                    return;
                }
                inOrder(node.left);
                System.out.println(node.data+" ");

                inOrder(node.right);
             }
             public static void main(String[] args) {
                Node root = new Node(1);
                root.left= new Node(2);
                root.right = new Node(3);
                root.left.left = new Node(4);
                root.left.right = new Node(5);
                root.right.left=new Node(6);
                root.right.right=new Node(7);
                mirror(root);
                inOrder(root);
        }
    }

