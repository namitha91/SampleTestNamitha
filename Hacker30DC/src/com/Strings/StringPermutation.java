package com.Strings;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
public class StringPermutation { 
	private static Set<String> set=new HashSet<String>();
	
	public StringPermutation() {
	
	}

    // Function to swap two characters
    static String swap(String str, int i, int j){
        char ch;
        char[] array = str.toCharArray();
        ch = array[i];
        array[i] = array[j];
        array[j] = ch;
        return String.valueOf(array);
    }
    // Function to print all the permutations of the string
    static Set<String> permute(String str,int low,int high){
        if(low == high && firstLetterConsonant(str)) {
        	set.add(str);
           //BOSystem.out.println(str);
        }
 
        int i;
        for(i = low; i<=high; i++){
            str = swap(str,low,i);
            permute(str, low+1,high);
            str = swap(str,low,i);
        }
		return set;
    }
    
    private static boolean firstLetterConsonant(String l)
    {
        boolean isConsonant;
        char s = l.toLowerCase().trim().charAt(0);
        //check to see if the first letter is not a vowel
        if(s != 'a' && s != 'e' && s != 'i' && s != 'o' && s != 'u')
        {
            isConsonant = true;
        } else {
            isConsonant = false;
        }
        return isConsonant;
    }
    // Function to read user input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter a string");
        try{
            str = br.readLine();
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        System.out.println("All the possible permutations of "+ str + "are");
        Set<String> permute = permute(str.toLowerCase(),0,str.length()-1);
        Iterator<String> newS=permute.iterator();
       // setNew=setNew.iterator();
        while(newS.hasNext()) {
        	System.out.println(newS.next());
        }
        System.out.println(set.size());
    }
}