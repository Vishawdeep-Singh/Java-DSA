public class bintodec {
    public static void Bintodec(int bin_num) {
    int mynum=  bin_num;
        int dec_num=0;
    
        int pow=0;
        while (bin_num>0) {
            int lastDigit= bin_num%10;
            dec_num = dec_num + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            bin_num = bin_num/10;
        }
        System.out.println("Decimal of" + mynum + "is" + dec_num );
    }
    public static void main(String args[]) {
        Bintodec(111);
        
    }
    
}
