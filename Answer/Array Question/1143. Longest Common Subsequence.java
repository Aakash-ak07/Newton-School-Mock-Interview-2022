// Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

// For example, "ace" is a subsequence of "abcde".
// A common subsequence of two strings is a subsequence that is common to both strings.

 

// Example 1:

// Input: text1 = "abcde", text2 = "ace" 
// Output: 3  
// Explanation: The longest common subsequence is "ace" and its length is 3.
// Example 2:

// Input: text1 = "abc", text2 = "abc"
// Output: 3
// Explanation: The longest common subsequence is "abc" and its length is 3.
// Example 3:

// Input: text1 = "abc", text2 = "def"
// Output: 0
// Explanation: There is no such common subsequence, so the result is 0.

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return lcs(text1, text2, text1.length(), text2.length());
    }

    public int lcs(String str1, String str2, int n, int m)
    {
        int[][] arr = new int[n + 1][m + 1];
        for(int i = 0; i < n + 1; i++)
            arr[i][0] = 0;
        
        for(int j = 0; j < m + 1; j++)
            arr[0][j] = 0;
        
        for(int i = 1; i < n + 1; i++)
        {
            for(int j = 1; j < m + 1; j++)
            {
                if(str1.charAt(i - 1) == str2.charAt(j - 1))
                    arr[i][j] = 1 + arr[i - 1][j - 1];
                else
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
            }
        }
        return arr[n][m];
    }   
}
