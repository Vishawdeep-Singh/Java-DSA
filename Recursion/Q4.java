package Recursion;

public class Q4 {
    public static int Function(String str , int i , int j , int n) {
        if(n==1){
            return 1 ;
        }
        if (n<=0) {
            return 0;
        }
        
        // int res = Function(str, i+1, j, n-1) + Function(str, i, j-1, n-1) -Function(str, i+1, j-1, n-2);
      
        System.out.println(i +" " + j);
        int fn1=Function(str, i+1, j, n-1);
        System.out.println(i +" " + j);
        int fn2=Function(str, i, j-1, n-1);
        System.out.println(i +" " + j);
        int fn3=Function(str, i+1, j-1, n-2);
        System.out.println(fn1 +" " + fn2 + " " + fn3);
        int res= fn1+fn2-fn3;

        if (str.charAt(i)==str.charAt(j)) {
            System.out.println("equaliser");
            res++;
            
        }
        return res;
    }


    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(Function(str, 0, n-1, n));
    }
}
