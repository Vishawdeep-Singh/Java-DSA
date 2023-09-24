package Binary_Trees;
import java.util.*;
public class Q4 {
    
 
  public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
     }
 }
 
class Solution {
    public static void main(String[] args) {
        System.out.println();
    }
    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res=new LinkedList<>();
        traverse(root,new HashMap<>(),res);
        return res;
    }
    public static String traverse(TreeNode root , Map<String,Integer> cnt , List<TreeNode> res ){
        if(root==null){
            return " ";
        }
        String representation = "("+ traverse(root.left,cnt,res)+")" +
        root.val + "(" + traverse(root.right , cnt , res)+")";

        cnt.put(representation,cnt.getOrDefault(representation,0)+1);
        if(cnt.get(representation)==2){
            res.add(root);
        }
        return representation;
    }
}
}
