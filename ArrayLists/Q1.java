package ArrayLists;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println(Function(list));
    }
    public static boolean Function(ArrayList<Integer>list) {
        boolean inc = true;
        boolean dec = true;
        for ( int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i+1)) {
                inc = false;
            }
            if (list.get(i)<list.get(i+1)) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
