package Recursion;

public class print_numbers_from_nTo1 {
    public static void main(String[] args) {
        int n=10;
        Print_n_to_1(n);

    }
    public static void Print_n_to_1(int n) {
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        Print_n_to_1(n-1);
    }
}
