// Program to find all the triplets with the given sum
//Time complexity: O(n^2)

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static  void tripletsSum (int arr[], int n, int sum)
	{
		Arrays.sort(arr);
		for(int i = 0; i < n-1; i++)
		{
			int left = i + 1;
			int right = n - 1;
			int x = arr[i];
			while(left < right)
			{
				if(x + arr[left] + arr[right] == sum)
				{
					System.out.println(x +" " + arr[left] +" "+  arr[right]);
					left++;
					right--;
				}
				else if(x + arr[left] + arr[right] < sum)
					left++;
				else
					right--;
			}
		}
	}
  
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int[] arr = new int [n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		tripletsSum (arr, n, sum);
	}
}


// Input:
// 5 -2
// 0 -1 2 -3 1

// Output:
// -3 -1 2
// -3 0 1
