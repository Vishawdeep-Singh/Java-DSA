package Bit_manupulation;

public class swap_two_number_without_using_3rd_variable {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println("value of x" + x + "and y" + y + "Before swap");
        x = x^y;
        y=x^y;
        x=x^y;
    }
}
