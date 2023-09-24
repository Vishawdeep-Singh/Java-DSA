package Greedy_Algorithms;

import java.util.Arrays;

import Stacks.PushAtBottom;

public class Q3 {
    public static void main(String[] args) {
        int n = 3  ;
        int k= 26;
      char arr[]=  lexo_Small(n, k);
      System.out.println(new String(arr));

    }
public static char[] lexo_Small(int n , int k) {
    char arr[]=new char[n];
    Arrays.fill(arr, 'a');
    for (int i = n-1; i>=0; i--) {
        k-=i;
        if (k>=0) {
            if (k>=26) {
                arr[i]='z';
                k=k-26;
            }
            else{
                arr[i]=(char)(k+97-1);
                k=k-arr[i]-'a'+1;
               
            }
        }
        else{
            break;
        }
        k+=i;
    }
    return arr;
}
}
