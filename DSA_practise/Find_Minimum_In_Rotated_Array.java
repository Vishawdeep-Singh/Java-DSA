package DSA_practise;

public class Find_Minimum_In_Rotated_Array {
    class Solution {
   
        public int findMin(int[] nums) {
           int min=-1;;
            for(int i = 0 ; i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
    min=nums[i+1];
                }
            }
            if(min==-1){
                min=nums[0];
            }
            return min;
        }
    }  
}

// O(logn)


class Solution {
   
    public int findMin(int[] nums) {
        int min=nums[0];
       int l=0;
       int r=nums.length-1;

       while(l<=r){
           if(nums[l]<nums[r]){
               min=Math.min(nums[l],min);
               break;
           }

           int mid=(l+r)/2;
           min=Math.min(min,nums[mid]);
           if(nums[mid]>=nums[l]){
               l=mid+1;
           }
           else{
               r=mid-1;
           }



       }
       return min;
}
}
