package Recursion;

public class Q_1 {
    public static void print_all_occurences(int arr[] , int key , int i) {
        if (i == arr.length) {
            return ;
        }
        if (arr[i]==key) {
            System.out.println( i + " ");
        }
        print_all_occurences(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        print_all_occurences(arr,5, 0);
    }
}
