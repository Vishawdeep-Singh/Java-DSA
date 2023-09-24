package Segment_Trees;

public class Max_Element_Queries {
    static int  tree[];
    public static void main(String[] args) {
        int arr[]={6,8,-1,2,17,1,3,2,4};
        int n=arr.length;
        init(n);
        buildTree(0, 0, n-1, arr);
        // for (int i = 0; i < tree.length; i++) {
        //     System.out.print(tree[i] + " ");
        // }
      System.out.println(getMax(arr,2,5)); 
      update(arr, 2, 20);
      System.out.println(getMax(arr, 2, 5));
    }
    public static void init(int n) {
        tree = new int[4*n];

    }
    public static void buildTree(int i , int si , int sj , int arr[]) {
        if (si==sj) {
          tree[i]=arr[si];
          return;  
        }
        int mid = (si + sj)/2;
        buildTree(2*i+1, si, mid, arr);
        buildTree(2*i+2, mid+1, sj, arr);
        tree[i]=Math.max(tree[2*i+1], tree[2*i+2]);
    }
   public static int getMax(int arr[] , int qi , int qj) {
    int n = arr.length;
    return getMaxUtil(0, 0, n-1, qi, qj);


   }
   public static int getMaxUtil(int i , int si , int sj , int qi , int qj) {
     if (si>qj || sj<qi) {
        return Integer.MIN_VALUE;
     }
     else if (si>=qi && sj<=qj) {
        return tree[i];
     }
     else{
        int mid = (si + sj)/2;
       int leftans= getMaxUtil(2*i+1, si, mid, qi,qj);
        int rightans= getMaxUtil(2*i+2, mid+1, sj, qi, qj);
        return Math.max(leftans, rightans);
     }
   }
   public static void update(int arr[] , int idx , int newVal ) {
    arr[idx]=newVal;
    int n=arr.length;
    updateUtil(0, 0, n-1, idx, newVal);
   }
   public static void updateUtil(int i , int si , int sj,int idx ,int newVal) {
    if (idx<si || idx>sj) {
        return;
    }
    tree[i]=Math.max(tree[i], newVal);
    if (si!=sj) {
         int mid = (si+sj)/2;
    updateUtil(2*i+1, si, mid, idx, newVal);
    updateUtil(2*i+2, mid+1, sj, idx, newVal);
    }
   
   }

}
