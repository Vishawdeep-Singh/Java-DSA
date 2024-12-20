package Linked_List;

public class Q5 {
    
    
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    public static void main(String[] args) {
        int k=3 ;
        int n=4;
        Node arr[] = new Node[k];

        arr[0] = new Node(1);arr[0].next = new Node(3);arr[0].next.next = new Node(5);arr[0].next.next.next = new Node(7);arr[1] = new Node(2);arr[1].next = new Node(4);arr[1].next.next = new Node(6);arr[1].next.next.next = new Node(8);arr[2] = new Node(0);arr[2].next = new Node(9);arr[2].next.next = new Node(10);arr[2].next.next.next = new Node(11);
        Node head = mergeKLists(arr, k - 1); 
        printList(head);
    }
   public static void printList(Node head){Node temp = head;while(temp != null){System.out.print(temp.data+" ");temp = temp.next;}System.out.println();}

   public static Node mergeKLists(Node arr[], int last) {
while(last!=0){
    int i=0,j=last;
    while(i<j){
        arr[i]= getSorted(arr[i],arr[j]);
        i++;
        j--;
        if(i>=j){
            last=j;
        }
    }
}
return arr[0];
    
   }
     public static Node getSorted(Node a , Node b) {
        Node result=null;
        if (a==null) {
            return b;
        }
        if(b==null){
            return a;
        }
        if(a.data<=b.data){
           result=a;
           result.next=getSorted(a.next, b) ;
        }
        else{
            result=b;
            result.next=getSorted(a, b.next);
        }
        return result;
     }
   }
