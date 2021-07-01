package com.comviva;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getSumOfDoubleBasePalindromes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER maximum as parameter.
     */

    public static int getSumOfDoubleBasePalindromes(int maximum) {
    	ArrayList<Integer> list = new ArrayList<>();

		// Only odds can be palindromes
		for (int i = 1; i < maximum; i += 2) {
			if (isPalindrome(i)) {
				list.add(i);
			}
		}

		String binary = "";
		int sum = 0;

		for (Integer i : list) {
			binary = convertToBinary(i);
			if (isPalindrome(binary))
				sum += i;
		}

		return sum;
    }
    static String convertToBinary(int input) {

		// get a number

		StringBuilder bin = new StringBuilder();

		int maxPower = 0;

		// get the largest power of two that can get
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (Math.pow(2, i) > input) {
				maxPower = i;
				break;
			}
		}

		// For each iteration, divide by two and append a binary place
		for (int i = 0; i < maxPower; i++) {
			if (input % 2 != 0) {
				bin.append(0);
			} else {
				bin.append(1);
			}
			input /= 2;
		}

		return bin.toString();

	}

	// Operator overloading
	static boolean isPalindrome(int input) {
		return isPalindrome(String.valueOf(input));
	}

	public static boolean isPalindrome(String input) {

		// Break into a char array
		char[] charArray = input.toCharArray();

		// Compare front and end character until meet at middle
		for (int i = 0, j = charArray.length-1; i < charArray.length / 2; i++, j--) {
			if (charArray[i] != charArray[j])
				return false;
		}

		return true;

	}
    
}



public class DoubleBasePalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int maximum = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.getSumOfDoubleBasePalindromes(maximum);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

