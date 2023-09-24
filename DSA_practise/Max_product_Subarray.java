package DSA_practise;

public class Max_product_Subarray {
    class Solution {
        public int maxProduct(int[] nums) {
         int ma = nums[0];
         int mi= nums[0];
          int ans=nums[0];
    
         for(int i=1 ;i<nums.length;i++ )  {
             if(nums[i]<0){
                 int temp;
        temp=ma;
        ma=mi;
        mi=temp;
             }
             ma=Math.max(nums[i], ma*nums[i]);
             mi=Math.min(nums[i],mi*nums[i]);
             ans=Math.max(ma,ans);
         }
      
         
      return ans;
    }
    
    }  
}
