package graph;

import java.util.HashSet;

public class grphClient {
    public static void main(String[] args) {
        graphCreation g=new graphCreation(7);

        g.AddEdge(1, 4, 6);//1 aur 4 ke beech m edge with cost 6
        g.AddEdge(1, 2, 10);
        g.AddEdge(2, 3, 7);
        g.AddEdge(3, 4, 5);
        g.AddEdge(4, 5, 1);
        g.AddEdge(5, 6, 4);
        g.AddEdge(7, 5, 2);
        g.AddEdge(6, 7, 3);
        g.Display();
        System.out.println(g.Nbr_of_edge());
        //g.removeEdge(4, 5);
        //g.removevertex(4);
        g.Display();
        System.out.println(g.hasPath(1,6,new HashSet<>()));
        g.printAllPath(1,6,new HashSet<>(),"");

    }
}
