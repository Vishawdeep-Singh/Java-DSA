package DSA_practise;

public class Reverse_String {
    class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        StringBuilder sb = new StringBuilder("");
     int i = S.length()-1;
     while(i>=0){
         while(i>=0 && S.charAt(i)=='.') i--;
         int j=i;
         
        while(i>=0 && S.charAt(i)!='.')i--;
        if(sb.length()==0){
           sb.append(S.substring(i+1,j+1)); 
        }
        else{
            sb.append('.' +S.substring(i+1,j+1) );
        }
        
     }
     String ans = sb.toString();
     return ans;
    }
}
}
