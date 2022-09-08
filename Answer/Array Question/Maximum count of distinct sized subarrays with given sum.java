//Maximum count of distinct sized subarrays with given sum


import java.util.*;
import java.lang.*;
import java.io.*;

//time complexity O(N)

class Main
{
	public static int maxSubsetSize(int[] arr, int n, int k) {
	   int x = 0;
	   HashSet<Integer> hs = new HashSet<Integer>();
	   int currentSum = 0;
	   for (int i = 0; i < n; i++) {
			currentSum += arr[i];
			if(currentSum < k)
			continue;
			
			if(currentSum > k)
			{
				while(currentSum > k)
				{
					currentSum -= arr[x++];
				}
			}
			if(currentSum == k)
			{
				hs.add(i - x + 1);
				int z = x;
				while (arr[z] == 0) 
				{
		          hs.add(i - z);
		          z++;
				}
			}
		}
		return hs.size();
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
		System.out.println(maxSubsetSize(arr, n, k));
	}
}


// Input:
// 4 2
// 0 1 1 0
  
// Output:
// 3
// Explanation: 
// The subset {{0, 1, 1, 0}, {0, 1, 1}, {1, 1}} is the subset of 3 subarrays such that the sum of each subarray is 2 and the size of each subarray is distinct. 
// The subarray {1, 1, 0} also has sum 2 but a subarray of size 3 is already included.
