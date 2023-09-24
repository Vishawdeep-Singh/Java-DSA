package Hashing;
import java.util.*;
public class Iteration_On_HashMap {
    public static void main(String[] args) {
           // create
           HashMap<String,Integer>hm=new HashMap<>();

           //Insert
           hm.put("India", 100);
           hm.put("China", 150);
           hm.put("US", 50);

           //Iterate
           Set<String> keys=hm.keySet();
           System.out.println(keys);

           for (String k : keys) {
            System.out.println("key="+k + ","+"value="+hm.get(k));
           }
    }
}
