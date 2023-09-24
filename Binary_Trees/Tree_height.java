package Binary_Trees;
import java.util.*;


public class Tree_height {
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
    public static int height(Node root){
        if (root==null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    public static int count(Node root){
        if (root==null) {
            return 0;
        }
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        return leftCount+ rightCount +1;
    }
    public static int sum(Node root) {
        if (root==null) {
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum + rightSum + root.data;
    }
    public static int diameter(Node root ){ //O(n2)
        if (root==null) {
           return 0; 
        }
        int leftDiam=diameter(root.left);
        int leftHt=height(root.left);
        int rightDiam=diameter(root.right);
        int rightHt=height(root.right);

        int selfDiam= leftHt+rightHt+1;

        return Math.max(selfDiam, Math.max(rightDiam, rightDiam));
    }
    static class Info{
        int diam;
        int ht;
         
        public Info(int diam, int ht){
            this.diam=diam;
            this.ht=ht;
        }

    }
    public static Info Diameter2(Node root) { //O(n)
        if (root==null) {
            return new Info(0, 0);
        }
        Info leftInfo = Diameter2(root.left);
        Info rightInfo = Diameter2(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(rightInfo.ht, leftInfo.ht)+1;
        return new Info(diam, ht);
    }
    public static boolean isIdentical(Node node , Node subRoot) {
        if (node==null && subRoot==null) {
            return true;
        } else if (node==null || subRoot==null || node.data!=subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root , Node subRoot) {
        if (root==null) {
            return false;
        }
        if (root.data==subRoot.data) {
            if (isIdentical(root,subRoot)) {
                return true;
            }
        }
        boolean leftAns=isSubtree(root.left, subRoot);
        boolean rightAns=isSubtree(root.right, subRoot);

        return leftAns || rightAns;
    }
    static class InfO{
        Node node;
        int  hd;
        public InfO(Node node , int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void Topview(Node root) {
        //Level order
        Queue<InfO> q = new LinkedList<>();
        HashMap<Integer,Node>map= new HashMap<>();
        int min=0,max=0;
        q.add(new InfO(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            InfO curr = q.remove();
            if (curr==null) {
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }
          else{
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }
            if (curr.node.left!=null) {
                q.add(new InfO(curr.node.left, curr.hd-1));
                min=Math.min(min, curr.hd-1);
            }
            if (curr.node.right!=null) {
                q.add(new InfO(curr.node.right,curr.hd+1));
                max=Math.max(max, curr.hd+1);
            }
          }
        }
        for (int i = min; i <=max; i++) {
            System.out.println(map.get(i).data);
        }
    }
    public static void Klevel(Node root , int level , int k) {
        if (root==null) {
            return;
        }
        if (level==k) {
            System.out.println(root.data+" ");
            return;
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left=  new Node(6);
        root.right.right = new Node(7); 
        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));
        // System.out.println(diameter(root));
        // System.out.println(Diameter2(root).diam);

        // Node subRoot=new Node(2);
        // subRoot.left=new Node(4);
        // subRoot.right = new Node(5);
        // System.out.println(isSubtree(root, subRoot));
    //    Topview(root);
    int k=2;
    Klevel(root, 1, k);
    }
}
