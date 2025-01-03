package linklistt;

public class dbllinkedlist {

    Node head;
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        //head.prev=node;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void reverseLL(){
        if(head==null||head.next==null){
                return;
        }
        Node crrnt=head.next;
        Node prev=head;
        while (crrnt!=null) {
            Node next = crrnt.next;
            crrnt.next = prev;
            prev = crrnt;
            crrnt = next;
        }
        head.next=null;
        head=prev;
    }
    public void display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println( "END");
    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
