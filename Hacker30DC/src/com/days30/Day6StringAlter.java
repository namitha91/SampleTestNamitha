package com.days30;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6StringAlter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        StringBuilder sb=new StringBuilder();
        
       // String 
        for(int i=0;i<n;i++){
            String str=scan.next();
        
           
            for(int j=0;j<str.length();j+=2){
           // if(j%2==0){
                System.out.print(str.charAt(j));
           // }
            
        }
        System.out.print(" ");
        for(int k=1;k<str.length();k++){
                if(k%2!=0){
                   System.out.print(str.charAt(k)); 
                }
            }
            System.out.println();
            
        }
        
    }
}




