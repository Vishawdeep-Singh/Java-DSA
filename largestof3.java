import java.util.*;
public class largestof3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number A,B,C");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A>=B){
            if(A>=C){
                System.out.println("A is largest");
            }
            else{
                System.out.println("C is largest");
            }
        }
        else{
            if(B>=C){

                System.out.println("B is largest");
            }
            else{
                System.out.println("C is largest");
            }
        }
    }
    
}
