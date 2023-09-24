package Stacks;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        String str = new String("/apna/colege");
        String res = simplify(str);
        System.out.println(res);
    }
    public static String simplify(String A) {
        Stack<String> s= new Stack<>();
        String res = "";
        res+="/";
        int len_A=A.length();

        for (int i = 0; i < A.length(); i++) {
            String dir="";
            while (i<len_A && A.charAt(i)=='/') {
                i++;
            }
            while (i<len_A && A.charAt(i)!='/') {
                dir+=A.charAt(i);
                i++;
            }
            if(dir.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else if (dir.equals(".")) {// forgot about else if
                continue;
            }
            else if (dir.length()!=0) {
               
                s.push(dir);
               }
                
            }
            Stack<String> st1 = new Stack<String>();
            while (!s.isEmpty()) {
                st1.push(s.pop());
            }
          
            while (!st1.empty()){if (st1.size() != 1)res += (st1.pop() + "/" );else res += st1.pop();}
    
            return res;
        }
      
    }

