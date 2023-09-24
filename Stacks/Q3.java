package Stacks;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        String str = "3[b2[v]]";
        System.out.println(decode(str));
    }
    public static String decode(String str) {
        Stack<Integer> inte = new Stack<>();
        Stack<Character> chara = new Stack<>();
        String temp = "";
        String  result = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count*10 + str.charAt(i)-'0';
                    i++;
                }
                inte.push(count);
                i--;
            }
            else if (str.charAt(i)=='[') {
                if (Character.isDigit(str.charAt(i-1))) {
                    chara.push(str.charAt(i));
                }
                else{
                    chara.push(str.charAt(i));
                    inte.push(1);
                }

            }
            else if (str.charAt(i)==']') {
                temp="";
                count=0;

                if(!inte.isEmpty()){
                    count = inte.peek();
                    inte.pop();
                }
                while (!chara.isEmpty() && chara.peek()!='[') {
                    temp=chara.peek()+temp;
                    chara.pop();
                }
                if(!chara.isEmpty()&&chara.peek()=='['){
                    chara.pop();

                    for (int j = 0; j < count; j++) {
                        result=temp+result;
                    }
                    for (int j = 0; j < result.length(); j++) {
                        chara.push(result.charAt(j));
                    }
                    result="";
                }
            }
            else{
                chara.push(str.charAt(i));
            }
        }
        while (!chara.isEmpty()) {
          result=chara.pop()+result;  
        }
        return result;

    }
}
