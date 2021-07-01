package com.days30;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Day14AbsDiffMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}









class Difference{
    // instance variables
    private int[] elements;
    public int maximumDifference;
    
    public Difference(int[] elements){
        this.elements = elements;
    }

    /** Sorts the array
    *   Saves max abs difference between first and last element to maximumDifference. **/
    public void computeDifference(){
        Arrays.sort(elements);
        this.maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
    }
    
    
    public void computeDifference1(){
        int sum=0;
        for(int index=0;index<elements.length;index++){
            for(int j=index+1;j<elements.length;j++){
                sum=Math.abs(elements[j]-elements[index]);
                
                if(sum>maximumDifference)
                maximumDifference=sum;
            }
        }
    }

}