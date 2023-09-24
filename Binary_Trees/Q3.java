package Binary_Trees;
import java.util.*;;
public class Q3 {
    static class Node{
        int data;
        Node left;
         Node right;
         public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
         }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        int x=3;
        deleteLeaves(root, x);
        inOrder(root);
    }
    static Node deleteLeaves(Node root , int x){
if (root==null) {
    return null;
}
root.left=deleteLeaves(root.left, x);
root.right=deleteLeaves(root.right, x);
if (root.data==x && root.left==null && root.right==null) {
   return null;
}
return root;

    }
    public static void inOrder(Node root){
        if (root==null) {
            return ;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
}
