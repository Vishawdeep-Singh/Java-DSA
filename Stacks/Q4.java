package Stacks;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        int arr[]={7,0,4,2,5,0,6,4,0,5};
       System.out.println(water(arr));
    }
    public static int water(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            while ((!stack.isEmpty()) && (arr[stack.peek()]<arr[i])) {
                int pop_height= arr[stack.peek()];
                stack.pop();
                
                if(stack.isEmpty()){
                    break;
                }
                int distance= i-stack.peek()-1;
                int min_height= Math.min(arr[stack.peek()], arr[i])-pop_height;
                ans += distance * min_height;

            }
            stack.push(i);
        }
        return ans;
    }
}
