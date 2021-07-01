package com.clone;

import java.io.*;
import java.util.*;


public class SubsTr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String Haycock = br.readLine();
         String Needle = br.readLine();

         int out_ = Solve(Haycock, Needle);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static int Solve(String Haycock, String Needle){
       // Write your code here
       System.out.println(Haycock+":Nami:"+Needle);
       return Haycock.indexOf(Needle);
    }
}