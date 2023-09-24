package Binary_Search_Trees;
import java.util.*;
public class Delete_A_Node {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

       root=delete(root, 1);
       System.out.println();

       inOrder(root);
       
    }
   
    public static void inOrder(Node root) {
        if (root==null) {
            return ;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    public static Node insert(Node root , int values) {
        if (root==null) {
            root=new Node(values);
            return root;
        }
        if (root.data>values) {
            //left subtree
          root.left=  insert(root.left, values);
        }
        else{
            //right subtree
            root.right=insert(root.right, values);
        }
        return root;
    }
    public static Node delete(Node root , int val){
        if (root.data<val) {
            root.right=delete(root.right, val);

        }
        else if(root.data>val){
            root.left=delete(root.left, val);
        }
        else{
            //case 1 - leaf node
            if (root.left==null&&root.right==null) {
                return null;
            }
            //case2- single child
            if (root.left==null) {
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }
            //case3 - both children
           Node IS =findInorderSuccessor(root.right);
            root.data= IS.data;
           root.right= delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}
