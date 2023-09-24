package Binary_Search_Trees;
import java.util.*;;
public class Mirror_A_BST {
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
    MirrorBST(root);
    inOrder(root);
    
}
public static Node MirrorBST(Node root) {
    if (root==null) {
        return null;
    }
  Node  leftS=MirrorBST(root.left);
   Node rightS=MirrorBST(root.right);
   
   root.left=rightS;
   root.right=leftS;
   return root;
}
}
