//Count number of common elements between a sorted array and a reverse sorted array


import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static int commonElement(int[] arr, int[] arr2, int n)
	{
		int first = 0;
		int second = n-1;
		
		int count = 0;
		while(first < n && second >= 0)
		{
			// if arr[first] is less then arr2[second]
			if(arr[first] < arr2[second])
				first++;
		
			else if(arr2[second] <arr[first])  // arr2 grater than arr
				second--;
				
			else // arr and arr2 both are equal
			{
				count++;
				first++;
				second++;
			}
		}
		return count;
	}
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int arr2[] = new int[n];
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.print(commonElement(arr, arr2, n));
	}
}
