package Recursion;

public class print_numbers_from_1_to_n {
    public static void inc(int n) {
        if(n==1){
            System.out.println(n + " ");
            return;
        }
        inc(n-1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        inc(n);
    }
}
