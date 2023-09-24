import java.util.Arrays;

public class erre {
    static int a,b;
    public static int[] repeatedNumber( int[] A) {
        Arrays.sort(A);
        int arr[]=new int[100];
        int ab[]=new int[2];
        
     for(int i = 0 ; i<A.length;i++){
         if(arr[A[i]]==0){
             arr[A[i]]=1;
         }
         if(arr[A[i]]==1){
             a=A[i];
         }
     }
     for(int i = 1 ; i<arr.length;i++){
         if(arr[i]==0){
             b=i;
         }
     }
     ab[0]=a;
     ab[1]=b;
     return ab;
     
    }
    public static void main(String[] args) {
        int num[]={3,1,2,5,3};
        System.out.println(repeatedNumber(num));
    }
    
}
