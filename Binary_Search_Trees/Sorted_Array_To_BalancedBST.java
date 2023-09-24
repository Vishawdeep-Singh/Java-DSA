package Binary_Search_Trees;
import java.util.*;
public class Sorted_Array_To_BalancedBST {
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
        int arr[]={3,5,6,8,10,11,12};
        Node root = createBST(arr, 0, arr.length-1);
        inOrder(root);
    }
    public static Node createBST(int arr[] , int st ,int end) {
        if (st>end) {
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left=createBST(arr, st, mid-1);
        root.right=createBST(arr, mid+1, end);
        return root;

    }
}
