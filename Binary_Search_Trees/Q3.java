package Binary_Search_Trees;
import java.util.*;
public class Q3 {
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
    public static ArrayList<Integer> inOrder(Node root , ArrayList<Integer> al) {
        if (root==null) {
            return al;
        }
        inOrder(root.left , al);
       al.add(root.data);
        inOrder(root.right , al);
        return al;
    }
  
    static int count=0;
    public static void main(String[] args) {
        int values[]={8,5,11,3,6,20};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root, values[i]);
        }
     int k=4;
    //  ArrayList<Integer> nums=inOrder(root, new ArrayList<Integer>());
    //  System.out.println(nums.get(k-1));
    System.out.println(Kthsamllest(root, k));

    }
    // optimised approach
    public static int Kthsamllest(Node root , int k) {
        int count =1;
        ans = -1;
        solve(root,k,count);
        return ans;
    }
    static int ans;
    public static void solve(Node root ,int k ,int count) {
        if (root==null) {
           return; 
        }
        solve(root.left, k, count);
        if (k==count) {
            ans=root.data;
            count++;
            return;
        }
        else {count++;
        solve(root.right, k, count);}
    }
}
