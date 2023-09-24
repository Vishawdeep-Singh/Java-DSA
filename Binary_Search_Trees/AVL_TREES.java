package Binary_Search_Trees;
import java.util.*;
public class AVL_TREES {
    static class Node {
        int data , height;
        Node left , right;
        Node(int data){
            this.data=data;
            height=1;

        }
    }
    public static Node root;
     public static int height(Node root){
        if (root==null) {
            return 0;
        }
        return root.height;
     }
     public static Node insert(Node root , int key) {
        if (root==null) {
            return new Node(key);
        }
        if (key<root.data) {
            root.left=insert(root.left, key);
            
        }
        else if (key>root.data) {
              root.right=insert(root.right, key);

        }
        else{
            return root;
        }
        root.height= 1 + Math.max(height(root.left), height(root.right));

        int bf = getBalance(root);

        if (bf>1 && key<root.left.data) {
            return rightRotate(root);
        }
        if (bf<-1 && key>root.right.data) {
            return leftRotate(root);
        }
        if (bf>1 && key>root.left.data) {
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
        if (bf<-1 && key<root.right.data) {
            root.right=rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
     }
     public static int getBalance(Node root) {
        if (root==null) {
            return 0;
        }
        return height(root.left)-height(root.right);
     }
}
