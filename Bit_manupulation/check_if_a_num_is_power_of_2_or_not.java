package Bit_manupulation;

public class check_if_a_num_is_power_of_2_or_not {
    public static void main(String[] args) {
        System.out.println(power(8));
    }
    public static boolean power(int n) {
        return (n & (n-1))==0;
    }
}
