package Recursion;
import java.util.*;

public class Remove_Duplicates {
    public static void removeDuplicates(String str , int idx , StringBuilder newStr , boolean map) {
         if (idx == str.length()) {
            System.out.println(newStr);
            return;
         }
         char currChar = str.charAt(idx);
         if (map[currChar-'a'] == true) {
            
         }
    }
}
