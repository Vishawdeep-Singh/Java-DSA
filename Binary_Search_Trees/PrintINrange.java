package Binary_Search_Trees;
import java.util.*;


public class PrintINrange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static void inOrder(Node root) {
        if (root==null) {
            return ;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
printIN_range(root, 5, 12);
    }

    public static void  printIN_range(Node root,int k1,int k2) {
        if (root==null) {
            return;
        }
        if (root.data>=k1 && root.data<=k2) {
            printIN_range(root.left, k1, k2);
            System.out.println(root.data+" ");
            printIN_range(root.right, k1, k2);
        } 
        else if (root.data<k1) {
            printIN_range(root.right, k1, k2);
        }
        else{
            printIN_range(root.left, k1, k2);
        }
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
}
