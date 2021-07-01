package com.days30;



import java.io.*;
import java.util.*;

class Node3 {
	int data;
	Node3 next;
	Node3(int d) {
        data = d;
        next = null;
    }
}

public class Day15LinkedListInsert {

    public static  Node3 insert(Node3 head,int data) {
        //Complete this method
    	Node3 start=head;
       Node3 newNode=new Node3(data);
       if(start==null) {
    	   head=newNode;
       }
		/*
		 * else if(start.next==null) { head.next=newNode; }
		 */else {
    	   while(start.next!=null) {
    		   start=start.next;
    	   }
    	   start.next=newNode;
       }
       return head;
       
            
            
         
    }

	public static void display(Node3 head) {
        Node3 start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node3 head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}



