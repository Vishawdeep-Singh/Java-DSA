package ArrayLists;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        getLonely(nums);
        
    }

    public static void getLonely( ArrayList<Integer>nums) {
        Collections.sort(nums);
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 1; i < nums.size()-1; i++) {
            if (nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1 <nums.get(i+1)) {
                list.add(nums.get(i));
            }
        }
        if (nums.size()==1) {
            list.add(nums.get(0));
        }
        if (nums.size()>1) {
            if (nums.get(0)+1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size()-2)+1 < nums.get(nums.size()-1)) {
                list.add(nums.get(nums.size()-1));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
