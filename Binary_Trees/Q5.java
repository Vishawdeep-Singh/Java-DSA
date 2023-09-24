package Binary_Trees;

public class Q5 {
    
  
  public class TreeNode {
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
    class Res{
        public int val;
    }
    
    public int maxPathSum(TreeNode root) {
       Res res = new Res();
       res.val=Integer.MIN_VALUE;
        maxPathSumUtil(root,res);
       return res.val;
    }
    public int maxPathSumUtil(TreeNode root ,  Res res){
        if(root==null){
            return 0;

        }
        int l = maxPathSumUtil(root.left , res);
        int r = maxPathSumUtil(root.right,res);
        res.val=Math.max(res.val,l+r+root.val);
        int ret= Math.max(root.val + Math.max(l,r), root.val);
        res.val=Math.max(res.val,ret);
        return ret;
    }
}
}
