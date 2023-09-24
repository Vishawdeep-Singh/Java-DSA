package Binary_Search_Trees;
import java.util.*;
public class Q1 {
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
       
            int values[]={8,5,11,3,6,20};
            Node root = null;
            for (int i = 0; i < values.length; i++) {
                root=insert(root, values[i]);
            }
            inOrder(root);
            System.out.println();

            System.out.println(SUMbst(root, 3, 5));
    }
    public static void inOrder(Node root) {
        if (root==null) {
            return ;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    static int sum = 0;
    public static int SUMbst(Node root , int L ,int R) {
        if (root==null) {
            return 0;
        }

        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.peek();
            q.remove();

            if (curr.data>=L && curr.data<=R) {
                sum+=curr.data;
            }
            if (curr.left!=null && curr.data>L) {
                q.add(curr.left);
            }
            if (curr.right!=null && curr.data<R) {
                q.add(curr.right);
            }
        }
        return sum;
    }
}
