package Strings;

public class Q_1 {
    public static void main(String[] args) {
        String str = "Sonu";

        System.out.println(name(str));
    }
    public static int name(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u') {
               
               count++;
            }
        }
        return count;
    }
}
