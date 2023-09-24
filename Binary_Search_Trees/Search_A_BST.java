package Binary_Search_Trees;
import java.util.*;
public class Search_A_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

       System.out.println(search(root, 1));
    }
    public static boolean search(Node root,int key) {
        if (root==null) {
            return false;
        }
        if (root.data==key) {
            return true;
        }
        if (root.data>key) {
           return search(root.left, key);
        }
        else{
            return search(root.right, key);
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
