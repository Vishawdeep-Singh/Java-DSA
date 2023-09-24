package Linked_List;

public class Q4 {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    void segregateeOdd_Even() {
        Node end=head;
        Node prev=null;
        Node curr=head;

        while (end.next!=null) {
            end=end.next;
        }
        Node new_end=end;
        while (curr.data%2 !=0 && curr!=end) { // if head and consecutive elemets are odd
            new_end.next=curr;
            curr=curr.next;
            new_end.next.next=null;
            new_end=new_end.next;
        }

        if(curr.data%2==0){
            head=curr;
            while(curr!=end){
                if(curr.data%2 ==0){
                    prev=curr;
                    curr=curr.next;
                }
                else{
                    prev.next=curr.next;
                    curr.next=null;
                    new_end.next=curr;
            
                    new_end=curr;
                    curr=prev.next;
                }
            }
        }
        else{
            prev=curr;
        }
        if(end!=new_end && end.data%2!=0){
            prev.next=end.next;
            end.next=null;
            new_end.next=end;
            new_end=end;

        }
    }
    void push(int new_data){Node new_node = new Node(new_data);new_node.next = head;head = new_node;}
    void printList(){Node temp = head;while(temp != null){System.out.print(temp.data+" ");temp = temp.next;}System.out.println();}
    public static void main(String[] args) {
        Q4 list = new Q4();
        list.push(6);
        list.push(1);
        list.push(4);
        list.push(5);
        list.push(10);
        list.push(12);
        list.push(8);
        
        System.out.println("Linked List");
        list.printList();
        System.out.println("Updated Link List");
        list.segregateeOdd_Even();
        list.printList();
    }

}
