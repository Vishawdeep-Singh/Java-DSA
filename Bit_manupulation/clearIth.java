package Bit_manupulation;

public class clearIth {
    public static int clear_Ith(int n , int i) {
        int bitmask=~(1<<i);
return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear_Ith(10, 2));
    }
}
