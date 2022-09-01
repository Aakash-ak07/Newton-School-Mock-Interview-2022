// Time Complexity - best case and avg case = O(nlogn)
// wrost case = O(N^2)
// Inplace Sorting
// Stable Sorting
// Based on Divide and Conquer Algorithem. An array is divided into subarrays by selecting a pivot element. Select the Pivot as last Element and Rearrange the Array


import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static int partition(int arr[], int start, int end) {
	    int pivot = arr[end];
	    int i = (start - 1);
	
	    for (int j = start; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;
	
	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }
	    int swap = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swap;
	    return i+1;
	}
	
	public static void quickSort(int arr[], int start, int end) {
	    if (start < end) 
	    {
	        int mid = partition(arr, start, end);
	        quickSort(arr, start, mid-1);
	        quickSort(arr, mid+1, end);
	    }
	}
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		quickSort(arr,0,n-1);
		for(int i = 0; i < n; i++)
		{
        	System.out.print(arr[i] + " ");
        	System.out.print("");
		}
	}
}


// Input
// 9
// 15 12 8 17 19 2 1 5 9 
  
// output:
// 1 2 5 8 9 12 15 17 19 
