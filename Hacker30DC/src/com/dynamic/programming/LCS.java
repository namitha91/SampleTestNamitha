package com.dynamic.programming;
//timecomplexity O(mn)

//n = s1.length()
//m = s2.length()
//
//Time: O( nm )
//
//We can upper bound time by the number of subproblems that we are going to solve.
//
//Space: O( nm )
class LCS {
	  public int longestCommonSubsequenceLength(String s1, String s2) {
		  int cache[][] = new int[s1.length() + 1][s2.length() + 1];

		    /*
		     * cache[s2.length()][s1.length()] is our original subproblem. Each entry in the
		     * table is taking a substring operation against whatever string is on the rows
		     * or columns.
		     * 
		     * It goes from index 0 to index s2Row/s1Col (exclusive)
		     * 
		     * So if my s1 = "azb" and s1Col = 2...then my substring that I pass to the
		     * lcs() function will be:
		     * 
		     * 0 1 2 "a  z  b"
		     * 
		     * "az" (index 2...our upper bound of the snippet...is excluded)
		     */
		    for (int s1Row = 1; s1Row <= s1.length(); s1Row++) {
		      for (int s2Col = 1; s2Col <= s2.length(); s2Col++) {
		    	 // if (s2Row == 0 || s1Col == 0) {
			        //  cache[s2Row][s1Col] = 0;
			      //  }
		         if (s1.charAt(s1Row - 1) == s2.charAt(s2Col - 1)) {
		          cache[s1Row][s2Col] = cache[s1Row - 1][s2Col - 1] + 1;
		        } else {
		          cache[s1Row][s2Col] = Math.max(
		            cache[s1Row - 1][s2Col], cache[s1Row][s2Col - 1]);
		        }
		      }
		    }

		    return cache[s1.length()][s2.length()]; 
	    
	  }
	  public static void main(String[] args)
	  {
	    LCS lcs = new LCS();
	    String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	  
	    
	  
	    System.out.println("Length of LCS is" + " " +
	                                  lcs.longestCommonSubsequenceLength(s1,s2 ) );
	  }
	}