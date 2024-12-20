package BackTracking;

public class FindPermutation {
    public static void main(String[] args) {
        String str = "abc";
        Permutation(str, "");
    }
    public static void Permutation(String str , String ans) {
        if (str.length()==0) {
           System.out.println(ans); 
           return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String NewStr = str.substring(0,i) + str.substring(i+1);
            Permutation(NewStr, ans+curr);
        }
    }
}
