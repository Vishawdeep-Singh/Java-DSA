package Binary_Search_Trees;
import java.util.*;
public class ValidBST {  
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
        System.out.println(IsValidBST(root, null, null));
    }
    public static boolean IsValidBST(Node root , Node min , Node max) {
        if (root==null) {
            return true;
        }
        if (min !=null && root.data<=min.data) {
            return false;
        }

        else if (max!=null && root.data>=max.data) {
            return false;
        }
        return IsValidBST(root.left, min, root) && IsValidBST(root.right, root, max);
        
    }
}

