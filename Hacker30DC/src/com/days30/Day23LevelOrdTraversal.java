package com.days30;


import java.io.*;
import java.util.*;
class Node1{
    Node1 left,right;
    int data;
    Node1(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day23LevelOrdTraversal {
static Queue<Node1> queue = new LinkedList<Node1>();
List<Integer> l=new ArrayList<Integer>();
	static void levelOrder(Node1 root){
      //Write your code here
      

    if( root != null ){
        queue.add(root);
    }
    while( !queue.isEmpty() ){
        Node1 tree = queue.remove();
       // l.add(tree.data);
        System.out.print(tree.data + " ");

        if( tree.left != null ){
            queue.add( tree.left );
        }
        if( tree.right != null ){
            queue.add( tree.right );
        }
    }

      
    }

	public static Node1 insert(Node1 root,int data){
        if(root==null){
            return new Node1(data);
        }
        else{
            Node1 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node1 root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}



