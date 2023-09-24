package ArrayLists;
import java.util.*;
public class sortArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.sort(list); //ascending order
System.out.println(list);
        //descending order
Collections.sort(list, Collections.reverseOrder());
System.out.println(list);
    }
}
