package Bit_manupulation;

public class count_set_bits_in_a_number {
    public static void main(String[] args) {
        System.out.println(function(10));
    }
    public static int function(int n) {
        int count = 0;
        while (n>0) {
            if ((n&1)!=0) {
                count ++;
            }
            n = n>>1;
        }
        return count;
    }
}
