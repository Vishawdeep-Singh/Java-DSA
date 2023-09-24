package Bit_manupulation;

public class convert_to_uppercase {
    public static void main(String[] args) {
        for(char ch ='A' ; ch<='Z';ch++){
            System.out.println((char)(ch | ' '));
        }
    }
}
