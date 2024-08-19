public class MiddleOfNode {

    public static int getLength( Node head){

        int j=0;

        while(head!=null){
            j++;
            head=head.next;
        }

        return j;
    }

    public static int getMiddleOfNode(Node head){

        int length= getLength(head);
        int middle=(length/2);
        

       

        while(middle>0){
            head=head.next;
            middle--;


        }

        return head.data;




    }


    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);


        System.out.println(getMiddleOfNode(head));


    }

    
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next=null;

    }
    
}