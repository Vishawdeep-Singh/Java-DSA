package Recursion;

public class Binary_string {
    public static void print_binary(int n , int lastPlace , String str) {

        if (n==0) {
            System.out.println(str);
            return;
        }



       print_binary(n-1, 0, str+=0);
       if (lastPlace==0) {
        print_binary(n-1, 1, str+=1);
       }
    }
    public static void main(String[] args) {
        print_binary(3, 0, new String(""));
    }
}
