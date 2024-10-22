package linklistt;

import linklistt.dbllinkedlist;

public class main {
    public static void main(String[] args) {
           /* linklistt.linklist ll=new linklistt.linklist();
            ll.insertfirst(1);
            ll.insertfirst(2);
            ll.insertfirst(3);
            ll.insertfirst(4);
            ll.insertlast(9);
            ll.insertAtSpecific(100,0);
            ll.display();
            ll.deleteFirst();
            ll.display();*/
            dbllinkedlist ll=new dbllinkedlist();
            ll.insertfirst(1);
            ll.insertfirst(2);
            ll.insertfirst(3);
            ll.insertfirst(4);
            ll.display();
            ll.reverseLL();
            ll.display();
    }

}
