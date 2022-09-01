// Find The Missing And Repeating Element In An Array (Time Complexity O(N))

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void missingAndRepet(int[] arr, int n)
    {
    	int repetElement = 0;
    	int missingElement = 0;
    	 
    	int i = 0;
    	while(i < n)
    	{
    		if (arr[i] == arr[arr[i] - 1])
    		{
    			i++;
    		}
    		else
    		{
    			swap(arr, i, arr[i] - 1);
    		}
    	}
    	for( i = 0; i < n; i++)
    	{
    		if(arr[i] != i+1)
    		{
	    		repetElement = arr[i];
	    		missingElement = i + 1;
	    		break;
    		}
    	}
    	System.out.println("Repeating: " + repetElement + " \nMissing: " + missingElement); 
    }
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
    	{
    		arr[i] = sc.nextInt();
    	}
    	missingAndRepet(arr, n);
	}
}

// Input:
// 5
// 1 2 3 4 1

// Output:
// Repeating: 1 
// Missing: 5
