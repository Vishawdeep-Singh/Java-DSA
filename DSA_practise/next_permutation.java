package DSA_practise;

public class next_permutation {
    class Solution {
        static int I,J;
        public void nextPermutation(int[] nums) {
            
          for(int i = nums.length-1;i>=0;i--){
              if(i<=0){
                  int start=0;
                  int end = nums.length-1;
                  while(start<end){
                  int temp2=nums[end];
                   nums[end]=nums[start];
                  nums[start]=temp2;
                  start++;
                  end--;
                  }
                  I=i;
                  break;
                 
              }
             
              if(nums[i]>nums[i-1]){
                   I = i ;
                  break;
              }
          }  
          if(I>0){
          for(int j = nums.length-1;j>0;j--){
              
              if(nums[j]>nums[I-1]){
                   J = j;
                  break;
              }
          }
          int temp;
          // step 3
          temp=nums[I-1];
          nums[I-1]=nums[J];
          nums[J]=temp;
          // step 4
          int first = I;
          int last= nums.length-1;
          while(first<last){
              int temp1=nums[last];
              nums[last]=nums[first];
              nums[first]=temp1;
              first++;
              last--;
          }
    
          }
    
        }
    }
}
