package treess;

import java.util.ArrayList;

public class binary_search_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            //this.left=this.right=null;
        }
    }
    public static Node insert(Node root,int value){
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(root.data>value){
            root.left=insert(root.left,value);
        }
        else {
            root.right=insert(root.right,value);
        }return root;
    }
    public static Node delete(Node root , int value){
        //search of node
        if (root ==null) return root;
        if (root.data>value){
          root.left  =delete(root.left,value);
        }
       else if(root.data<value){
            root.right=delete(root.right,value);
        }
        else{
            //case1
            if(root.left==null && root.right==null) return null;
            //case 2
            if(root.right==null) return root.left;
            else if (root.left==null) return root.right;
            //case3
            Node in_ordr_sucessor= In_ordr_succesor(root);
            root.data=in_ordr_sucessor.data;
            root.right=delete(root.right,in_ordr_sucessor.data);
        }
        return root;
    }
    public static Node In_ordr_succesor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void inordr(Node root){
        if(root==null){
            return;
        }
        inordr(root.left);
        System.out.print(root.data+" ");
        inordr(root.right);
    }
    public static void search(Node root,int data ){
        if(root.data==data){
            return;
        } else if (root.data>data) {
            search(root.left,data);
        }
        else search(root.right,data);
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for (int i = 0; i <values.length ; i++) {
            root=insert(root,values[i]);
        }
        inordr(root);
        System.out.println();

    }
}

