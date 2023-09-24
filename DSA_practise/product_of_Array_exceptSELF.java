package DSA_practise;

public class product_of_Array_exceptSELF {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int left[]=new int[nums.length];
            int right[]=new int[nums.length];
            int ans[]=new int[nums.length];
            for(int i=1 ; i<nums.length;i++){
                left[0]=nums[0];
                left[i]=nums[i]*left[i-1];
            }
            for(int i=nums.length-2 ; i>=0;i--){
                right[nums.length-1]=nums[nums.length-1];
                right[i]=nums[i]*right[i+1];
            }
    
            for(int i = 1 ; i<nums.length-1;i++){
                
                ans[i]=left[i-1]*right[i+1];
                
    
            }
            ans[0]=right[1];
            ans[nums.length-1]=left[nums.length-2];
            return ans;
    
        }
    }
}
