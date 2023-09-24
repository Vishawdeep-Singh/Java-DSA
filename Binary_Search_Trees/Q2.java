package Binary_Search_Trees;
import java.util.*;
public class Q2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
     static int min_diff , min_diff_key;
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
    public static void inOrder(Node root) {
        if (root==null) {
            return ;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int values[]={8,5,11,3,6,20};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
       System.out.println(maxDiff(root, 2));
    }
    public static void ABSBST(Node root , int k) {
        if (root==null) {
            return;
        }
        if (root.data==k) {
            min_diff_key=k;
            return;
        }
        if (min_diff>Math.abs(root.data-k)) {
            min_diff=Math.abs(root.data-k);
            min_diff_key=root.data;
        }
        if (k<root.data) {
            ABSBST(root.left, k);
        }
        else{
            ABSBST(root.right, k);
        }
    }
    public static int maxDiff(Node root ,int k) {
        min_diff=Integer.MAX_VALUE; min_diff_key=-1;

        ABSBST(root, k);
        return min_diff_key;
    }
}
