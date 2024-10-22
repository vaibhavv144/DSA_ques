package treess;

import java.util.Scanner;

public class tree_build {
    class Node{
        Node left;
        Node right;
        int data;
    }
    private Node root;
    public tree_build() {
           this.root=createTree();
    }
    private Node createTree(){
            Scanner sc=new Scanner(System.in);
            int item=sc.nextInt();
            Node nn=new Node();
            nn.data=item;
            boolean left=sc.nextBoolean();
            if(left==true){
                nn.left=createTree();
            }
            boolean right=sc.nextBoolean();
           if(right==true){
            nn.right=createTree();
        }
           return nn;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node root){
        if(root==null){
            return;
        }
        String str="";
        str+=root.data;
        str="<--"+str+"-->";
        if(root.left!=null){
            str=root.left.data+str;
        }
        else{
            str="."+str;
        }
        if(root.right!=null){
            str=str+root.right.data;
        }
        else{
            str=str+"..";
        }
        System.out.println(str);
        display(root.left);
        display(root.left);
    }

    public static void main(String[] args) {

        tree_build bt=new tree_build();
        bt.display();
    }
}
