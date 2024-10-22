package practise_acc;

public class lnked_lst {
    public static class  Node{
        int data;
        Node next;

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    //Reversing the linked list
    public static Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front =temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    public static void mid_of_LL(Node head){
        Node fast=head;
        Node slow=head;
        while (fast!=null&& fast.next != null && slow != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);

    }

    public static boolean has_cycle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }

        }
        return false;
    }


    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
       // return false;
    }

    public static void main(String[] args) {

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
//
//        Node head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
//        Node fourth = new Node(4);
//        Node fifth = new Node(5);
//        head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = fifth;
//        // Create a loop
//        fifth.next = third;
//        printList(head);
//        System.out.println();
//        head=reverse(head);
//        printList(head);
      //  mid_of_LL(head);

//        if(has_cycle(head)){
//            System.out.println("has cycle");
//        }
//        else System.out.println("no cycle");

    }
}
