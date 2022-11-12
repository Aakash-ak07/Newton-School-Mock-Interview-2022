// We have a string s of length n, which contains only UPPERCASE characters and we have a number k (always less than n). We can make at most k changes in our string. In one change, you can replace any s[i] (0<= i < n) with any uppercase character (from 'A' to 'Z'). After k changes, find the maximum possible length of the sub-string which have all same characters.

// Example 1:
// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Change 2 'B' into 'A'. 
// Now s = "AAAA"

// Example 2:
// Input: s = "ADBD", k = 1
// Output: 3
// Explanation: Change 'B' into 'D'.
// Now s = "ADDD"

// Your Task:
// You don't need to read or print anything. Your task is to complete the function characterReplacement() which takes s and k as input parameters and returns the maximum length of sub-string after doing k changes.
 
// Expected Time Complexity: O(n)
// Expected Space Complexity: O(26)
// Constraints:
// 1 <= n <= 105
// 0 <= k < n


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.characterReplacement(s, k);
            System.out.println(ans);
        }
    }
}

class Solution
{
    public int characterReplacement(String s, int k)
    {
        int i = 0, j = 0, max = 0, res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(j < s.length())
        {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            max = Math.max(max, map.get(s.charAt(j)));
            if((j - i + 1) - max > k)
            {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
            res = Math.max(res, j - i + 1);
            j++;
        }
        return res;
    }
}
