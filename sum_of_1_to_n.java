import java.util.*;
public class sum_of_1_to_n {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int counter=1;
        int sum=0;
        while (counter<=n) {
            sum=sum+counter;
            counter++;
            
        }
        System.out.println("Sum of number is"+ (sum));
    }
    
}
