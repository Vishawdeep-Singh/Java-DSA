package Bit_manupulation;

public class check_oddOReven {
    public static void oddOReven(int n) {
        int bitmask=1;
        if ((n & bitmask)==0) {
            //even number
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddOReven(7);
    }
}
