package Recursion;

public class first_occurence {
    public static int firstOccurence(int arr[] , int key , int i) {
        if(i==arr.length-1){
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,5,10,2,5,3};
        System.out.println(firstOccurence(arr, 5, 0));
    }
}
