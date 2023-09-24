package Strings;
import java.util.*;
public class string_compression {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compression(str));
    }
    public static StringBuilder compression(String str) {
        // String newStr="";
        // for (int i = 0; i < str.length(); i++) {
        //     Integer count = 1;
        //     while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
        //         count++;
        //         i++;
        //     }
        //     newStr+=str.charAt(i);
        //     if (count>1) {
        //         newStr+=count.toString();
        //     }
        //     System.out.println(i);
        // }
        // return newStr;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
                int count = 1;
                while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
                    count++;
                    i++;
                }
                sb.append(str.charAt(i));
                if (count>1) {
                    sb.append(count);
                }
                System.out.println();
            }
            return sb;

    }
}
