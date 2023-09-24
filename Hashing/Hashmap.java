package Hashing;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        // create
        HashMap<String,Integer>hm=new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);

        //Get
        int population=hm.get("India");
        System.out.println(population);

        //contains key
        System.out.println(hm.containsKey("India"));

        //remove
        System.out.println(hm.remove("China"));

        //Size
        System.out.println(hm.size());

        //Is empty
        System.out.println(hm.isEmpty());

    }
}
