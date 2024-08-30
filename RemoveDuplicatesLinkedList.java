public class RemoveDuplicatesLinkedList {

    public static Node RemoveDuplicates(Node head){
        Node current = head;

        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }

        }
        return head;


    }
     public static void display(Node head){
        Node current = head;

        while (current!=null) {

            System.out.println(current.data);
            current = current.next;
            
        }
     }
    public static void main(String args[]){
        Node head= new Node(1);
        head.next=new Node(2);
        head.next.next= new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next= new Node(4);
        head.next.next.next.next.next=new Node(5);

        display(head);
        head=RemoveDuplicates(head);
        display(head);
    }
    
}

