package com.days30;

import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
public class Day24RemoveDupLinkedLsit {


    public static Node removeDuplicates(Node head) {
        //Write your code here
        if(head==null){
            return head;
        }
        Node cur=null;
        cur=head;
        while(cur.next!=null){
       if( cur.data==cur.next.data){
            cur.next=(cur.next).next;
        }else
            cur=cur.next;
    }
        return head;
    }
    public static  Node insert(Node head,int data)
    {
        Node newNode=new Node(data);			
        if(head==null)
            head=newNode;
        else if(head.next==null)
            head.next=newNode;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=newNode;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }



