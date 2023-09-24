package DivideNConquer;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        int arr[]= {2,4,1,3,5};
       int inv= mergeSort(arr, 0, arr.length-1);
       System.out.println(inv);
    }

    public static int mergeSort(int arr[] , int si , int ei) {
       
       int inv=0; 
       if(si<ei){
             
        int mid= si+(ei-si)/2;
        inv+=mergeSort(arr, si, mid);
        inv+=mergeSort(arr, mid+1, ei);
        inv+=merge(arr,si,mid,ei);
        }
return inv;
       
    }
    public static int merge(int arr[] , int si , int mid , int ei) {
        int temp[] = new int[ei-si+1];
int i = si ; //iterator for left part
int j = mid+1; // iterator for right part
int k = 0 ; // iterator for temporary array
int inv=0;
while (i<=mid && j<= ei) {
    if (arr[i]<arr[j]) {
        temp[k]=arr[i];
        i++; 
        k++;
    }
    else{
        temp[k] = arr[j];
        inv+=mid+1-i;// we did this because In left part lets say some element is geater than right part of some index , so In left part next element are greater than the right part element as left and right part are sorted so we subtract the indexed element from count and add count till mid.
j++; k++;
    }
    
}
//left part
while(i<=mid){
    temp[k++]=arr[i++];
   
}
while (j<=ei) {
    temp[k++]=arr[j++];
}

for (k = 0 , i=si; k < temp.length; k++ ,i++) {
    arr[i]=temp[k];
}
return inv;


        
    }
}
