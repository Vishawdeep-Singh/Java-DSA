package DivideNConquer;

public class Q2 {
public static void main(String[] args) {
    int nums[]={2,2,1,1,1,2,2};
    System.out.println(majorityElementRec(nums, 0, nums.length-1));

}
public static int majorityElementRec(int[] nums , int si ,int ei ) {
    if (si==ei) {
       return nums[si]; 
    }
    int mid= si+ (ei-si)/2;
    int left = majorityElementRec(nums, si, mid);
    int right = majorityElementRec(nums, mid+1, ei);

if(left==right){
    return left;
}
    int leftcount = countInrange(nums, left, si, ei);
    int rightcount = countInrange(nums, right, si, ei);
    

    int var= leftcount>rightcount? left:right;
    System.out.println(var);
    return leftcount>rightcount? left:right;
}

public static int countInrange(int nums[] , int num ,int si , int ei) {
     
    int count = 0;
    for (int i = si; i <= ei; i++) {
        if (nums[i]==num) {
            count++;
        }
    }
    
    return count;
}

}