package Binary_Search_Trees;
import java.util.*;
public class BST_TO_BALANCED_BST {
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
        Node root = new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
         root.right = new Node(10);
         root.right.right=new Node(11);
         root.right.right.right=new Node(12);
        root= balanceBST(root);
        inOrder(root);
    }

    public static Node balanceBST(Node root) {
        //inorder sequence
        ArrayList<Integer> inOrder = new ArrayList<>();
        getINORDER(root, inOrder);

        root=createBST(inOrder, 0, inOrder.size()-1);
        return root;


    }
    public static void getINORDER(Node root , ArrayList<Integer> inOrder) {
        if (root==null) {
            return;
        }
        getINORDER(root.left, inOrder);
        inOrder.add(root.data);
        getINORDER(root.right, inOrder);
    }
    public static Node createBST(ArrayList<Integer> inOrder , int st ,int end) {
        if (st>end) {
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inOrder.get(mid));
        root.left=createBST(inOrder, st, mid-1);
        root.right=createBST(inOrder, mid+1, end);
        return root;

    }
}
