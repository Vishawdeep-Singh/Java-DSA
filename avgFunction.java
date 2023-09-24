import java.util.*;
public class avgFunction {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in)  ;
       System.out.println("Enter first number");
       double x = sc.nextDouble();
       System.out.println("Enter second number");
       double y = sc.nextDouble();
       System.out.println("Enter third number");
       double z = sc.nextDouble();
       System.out.println("The average of three nummbers are" + average(x, y, z));
    }
    public static double average(double x , double y , double z) {
        return (x+y+z)/3;
        
    }
}
