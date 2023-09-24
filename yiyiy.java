import java.util.*;
public class yiyiy {
    class Solution {
        public static List<String> find_permutation(String S) {
            List<String>ans=new ArrayList<String>();
            int i=0;
            solve(ans,i,S);
            Collections.sort(ans);
            return ans;
    }
    
    public static void solve(List<String>ans,int i , String s){
        if(i>=s.length()){
         
        String curr="";
        for(int k=0;k<s.length();k++){
            curr+=s.charAt(k);
        }
        if(ans.contains(curr)==false){
            ans.add(curr);
            return;
        }
            
        }
        
        for(int j=i;j<s.length();j++){
           s= swap(s,i,j);
           System.out.println( "After swap1 "+ i + " ," + j);
            solve(ans,i+1,s);
            System.out.println( "After solve "+ i + " ," + j);
           s= swap(s,i,j);
        }
    }
    public static String swap(String s , int i ,int j){
        char[] arr= s.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);
    }
public static void main(String[] args) {
    
   
    
    
        String S = "ABC";
      List<String>ab=new ArrayList<>();
        ab = find_permutation(S);
        for( int i = 0; i<ab.size(); i++)
        {
            System.out.println(ab.get(i)+" ");
        }
        System.out.println();
                    
    }
    }
}
