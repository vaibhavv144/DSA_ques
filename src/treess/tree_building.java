package treess;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class tree_building {
    static class Node{
        //this class represent the all node of the tree
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int i=-1;
        public static Node build_tree(int nodes[]) {
        i++;
        if(nodes[i]==-1){
            return null;
        }
        Node newNode =new Node(nodes[i]);
        newNode.left=build_tree(nodes);
        newNode.right=build_tree(nodes);
        return newNode;
        }
    }
    public static void preorder_transversal(Node root){
        //Root is printed first here that's why it is preorder
        if(root==null){
            return;
        }
        System.out.print(root.data);
        preorder_transversal(root.left);
        preorder_transversal(root.right);
    }
    public static void inorder_transversal(Node root){
        if(root==null){
            return;
        }
        inorder_transversal(root.left);
        System.out.print(root.data);
        inorder_transversal(root.right);
    }
    public static void postorder_transversal(Node root){
        if(root==null){
            return;
        }
        postorder_transversal(root.left);
        postorder_transversal(root.right);
        System.out.print(root.data);
    }
    public static void level_order_transversal(Node root){
        if(root==null){
            return;
        }
        Queue <Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node crr=q.remove();
            if(crr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }
            else{
                System.out.print(crr.data);
                if(crr.left!=null){
                    q.add(crr.left);
                }
                if(crr.right!=null){
                    q.add(crr.right);
                }
            }
        }
    }
    public static List<List<Integer>> leve(Node root){
       List<List<Integer>> ll=new ArrayList<>();
       List<Integer>ll1=new ArrayList<>();
        Queue <Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node cr= q.poll();
            ll1.add(cr.data);
            System.out.println();

            if(cr.left!=null){
                q.add(cr.left);
            }
            if(cr.right!=null){
                q.add(cr.right);
            }
        }
        ll.add((new ArrayList<>(ll1)));
        return ll;
    }
    public static int count_node(Node root){
        if(root==null){
            return 0;
        }
        int left=count_node(root.left);
        int right=count_node(root.right);
        return left+right+1;

    }
    public static int count_node_data(Node root){
        if(root==null){
            return 0;
        }
        int left=count_node_data(root.left);
        int right=count_node_data(root.right);
        return left+right+ root.data;

    }
    public static int height_of_tree(Node root){
        if(root==null){
            return 0;
        }
        int left_h=height_of_tree(root.left);
        int right_h=height_of_tree(root.right);
        int max_height=Math.max(left_h,right_h);
        return max_height+1;
    }

    public static int diameter_of_tree(Node root){//This is O(n^2) complexity it checks all the three (a,b,c)for each and every node
        if(root==null){
            return 0;
        }
        int a=diameter_of_tree(root.left);
        int b=diameter_of_tree(root.right);
        int c=height_of_tree(root.left)+height_of_tree(root.right)+1;
        int ans=Math.max(a,Math.max(b,c));
        return ans;
    }
    public static void main(String[] args) {
        //Building tree from the given sequence
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root =tree.build_tree(nodes);
       /* System.out.println(root.data);//This will give the data of root node of the following binary tree
        preorder_transversal(root);
        inorder_transversal(root);
        postorder_transversal(root);
        level_order_transversal(root);*/
        /*System.out.println(count_node(root));
        System.out.println(count_node_data(root));
        System.out.println(height_of_tree(root));*/
       // System.out.println(diameter_of_tree(root));
        List<List<Integer>>list=leve(root);
        System.out.println(list);
       level_order_transversal(root);



    }
}
