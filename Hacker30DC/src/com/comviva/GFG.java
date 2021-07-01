package com.comviva;

//Java Program for Checking double
//base Palindrome.

public class GFG {

//generates even and odd palindromes
	static int makePalindrome(int n, boolean odd) {
		int res = n;
		if (odd) {
			n = n / 10;
		}
		while (n > 0) {
			res = 10 * res + n % 10;
			n /= 10;
		}
		return res;
	}

//Check if a number is palindrome
//in base k
	static boolean isPalindrome(int n, int base) {
		int reversed = 0;
		int temp = n;
		while (temp > 0) {
			reversed = reversed * base
					+ temp % base;
			temp /= base;
		}
		return reversed == n;
	}

//function to print sum of Palindromes
	static void sumPalindrome(int n, int k) {

		int sum = 0, i = 1;

		int p = makePalindrome(i, true);

		// loop for odd generation of
		// odd palindromes
		while (p < n) {
			if (isPalindrome(p, k)) {
				sum += p;
			}
			i++;

			// cout << p << " ";
			p = makePalindrome(i, true);
		}

		i = 1;

		// loop for generation of
		// even palindromes
		p = makePalindrome(i, false);
		while (p < n) {
			if (isPalindrome(p, k)) {
				sum += p;
			}
			i++;
			p = makePalindrome(i, false);
		}

		// result of all palindromes in
		// both bases.
		System.out.println("Total sum is " + sum);
	}

//driver code
	public static void main(String[] args) {
		int n = 5, k = 10;
		sumPalindrome(n, k);

	}
}
