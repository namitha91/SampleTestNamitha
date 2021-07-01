package com.days30;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10Bianry {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int binary[]=new int[n];
        int index=0;
        int count=0;
        while(n>0){
            binary[index++]=n%2;
            // System.out.println(binary[index]);
            
            n=n/2;
            
            
        }
        int result=0;
        for(int i=index-1;i>=0;i--){
            
            if(binary[i]!=0 ) {
              count++;  
            }
            else{
                count=0;
            }
            result=Math.max(result,count);
        }  
        System.out.println(result);
        scanner.close();
    }
}



