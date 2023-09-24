package ArrayLists;
import java.util.*;


public class Q4 {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> ans1=new ArrayList<>();
       ans1= beautifulArray(n);
       for (int i = 0; i < ans1.size(); i++) {
        System.out.println(ans1.get(i));
       }
    }
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(1);

        for (int i = 2; i <=n; i++) {
            ArrayList<Integer>temp=new ArrayList<>();
            for (Integer e:ans) {
                if (2*e<=n) {
                    temp.add(e*2);
                   
                }
            }
            for (Integer e:ans) {
                if (2*e-1<=n) {
                    temp.add(e*2-1);
                }
            }
            ans=temp;
        }
        return ans;
    }
}
