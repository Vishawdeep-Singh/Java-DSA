package BackTracking;

public class findSubsets {
    public static void main(String[] args) {
        String str = "abc";
        GetSubarrays(str, "", 0);

    }

    public static void GetSubarrays(String str , String ans , int i) {
        if (i==str.length()) {
           System.out.println(ans); 
           return;

        }
        GetSubarrays(str, ans+str.charAt(i), i+1); // yes case
        GetSubarrays(str, ans, i+1); // no case
    }

}
