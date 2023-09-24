import java.util.*;;
public class arrayQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            
            System.out.println("Enter the" + (i+1) + "number");
    

            arr[i]=sc.nextInt();
            
        }
        if (op(arr)) {
            System.out.println(
                "true"
            );
        }
      else{
        System.out.println("False");
      }
    }
    public static boolean op(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return true;
                }
                
            }
            
        }
        return false;
    }
}
