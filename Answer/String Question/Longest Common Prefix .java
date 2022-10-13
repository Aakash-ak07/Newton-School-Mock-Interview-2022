// Longest common prefix (LCP) for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

// For Example: longest common prefix of “abcdefgh” and “abcefgh” is “ABC”.

// //   Horizontal Scanning Approach
// Algorithm

//     Iterate through the string one by one from S1 till SN.
//     For each iteration till ith index, the LCP(S1…Si) can be obtained.
//     In case, the LCP is an empty string, terminate loop and return the empty string.
//     Else, continue and after scanning of N strings, the LCP(S1…SN) can be obtained.
------------------------xxxxxxxx-----------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public String longestCommonPrefix(String[] S) 
  {
		if (S.length == 0) return "";
		String prefix = S[0];
		for (int i = 1; i < S.length; i++)
			while (S[i].indexOf(prefix) != 0) 
      {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) return "";
			}        
		return prefix;
	}
	public static void main(String args[]) {
		// Your code goes here
		Main ob = new Main();
		String s[] = {"flower", "flow", "flight"};
		System.out.println(ob.longestCommonPrefix(s));
	}
}

// Input: S[] = {“abcdefgh”, “abcefgh”}
// Output: “abc”
// Explanation: Explained in the image description above

// Input: S[] = {“abcdefgh”, “aefghijk”, “abcefgh”}
// Output: “a”
