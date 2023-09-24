package Bit_manupulation;

public class get_Ith_bit {
    public static int get_Ith_bit(int n , int i) {
        int bitmask=1<<i;
        if ((n&1<<i)==0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(get_Ith_bit(7, 2));
    }
}
