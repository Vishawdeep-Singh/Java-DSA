package Binary_Search_Trees;

import java.util.ArrayList;

public class Merge_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        Node root=MergeBSt(root1, root2);
    }
    public static Node createBst(ArrayList<Integer>arr,int si,int ei) {
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBst(arr, si, mid-1);
        root.right=createBst(arr, mid+1, ei);
        return root;

    }
    public static Node MergeBSt(Node root1,Node root2) {
        ArrayList<Integer>arr1=new ArrayList<>();
        getInorder(root1,arr1);
        ArrayList<Integer>arr2=new ArrayList<>();
        getInorder(root2, arr2);

        int i=0,j=0;
        ArrayList<Integer>finalArr=new ArrayList<>();
        while (i<arr1.size()&&j<arr2.size()) {
            if(arr1.get(i)<arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
                j++;
        }
        return createBst(finalArr, 0, finalArr.size()-1);


    }
    public static void getInorder(Node root,ArrayList<Integer>arr) {
        if(root==null){
            return;

        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    
}
