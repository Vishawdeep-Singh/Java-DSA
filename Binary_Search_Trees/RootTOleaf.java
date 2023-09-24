package Binary_Search_Trees;
import java.util.*;
public class RootTOleaf {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
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
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        PrintRoot2leaf(root, new ArrayList<>());
    }
    public static void inOrder(Node root) {
        if (root==null) {
            return ;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    public static void PrintRoot2leaf(Node root , ArrayList<Integer>path) {
        if (root==null) {
            return;
        }
        path.add(root.data);
        if (root.left==null && root.right==null) {
            printPath(path);
        }
        PrintRoot2leaf(root.left, path);
        PrintRoot2leaf(root.right, path);
        
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i <path.size(); i++) {
            System.out.print(path.get(i)+ " ");
        }
        System.out.println();
    }
}
