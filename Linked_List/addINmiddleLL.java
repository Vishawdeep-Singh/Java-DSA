package Linked_List;

public class addINmiddleLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
            }
            public static Node head;
            public static Node tail;
            public void addFirst(int data){
                //step 1 = create new node
                Node newNode = new Node(data);
               if (head==null) {
                   head = tail = newNode;
                   return;
               }
              
               // step 2 newnode next = head
               newNode.next = head; //link
               //step 3 - head= newNode
               head=newNode;
            }
            public  void addLast(int data) {
               Node newNode= new Node(data);
               if (head==null) {
                   head=tail=newNode;
                   return;
               }
               tail.next=newNode;
               tail=newNode;
               
            }
            public void print(){
               if (head==null) {
                   System.out.println("LL is empty");
                   return;
               }
               Node temp = head;
               while (temp!=null) {
                   System.out.print(temp.data);
                   temp=temp.next;
               }
               System.out.println();}

            public void middle(int idx , int data){
                Node newNode = new Node(data);
                Node temp = head;
                int i = 0;

                while (i<idx-1) {
                    temp=temp.next;
                    i++;
                }
                newNode.next = temp.next;
                temp.next=newNode;
            }

            public static void main(String[] args) {
                LinkedList ll =new LinkedList();
                
                ll.addFirst(2);
                
                ll.addFirst(1);
                
                ll.addLast(3);
            
                ll.addLast(4);

                ll.middle(2,9);

                
                ll.print();
        
            }
}
