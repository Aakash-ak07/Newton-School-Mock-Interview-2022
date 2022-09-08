// Sort an array without changing position of negative numbers

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static int[] sortArray(int[] arr, int n) 
    {
	    for (int i=0; i < n; i++) 
	    {
	        for (int j = 0; j < n-1; j++) 
	        {
	            int temp = arr[j];
	            if (temp >= 0) 
	            {
	            	int k = j+1;
	            	while(arr[k] < 0)
                       k++;
	                if (arr[j] > arr[k] && arr[k] >= 0) 
	                {
	                    arr[j] = arr[k];
	                    arr[k] = temp;
	                }
	            }
	        }
	    }
	    return arr;
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
        int result[] = sortArray(arr,n);
        
        for(int i = 0; i < n; i++)
        {
        	arr[i] = result[i];
        	System.out.print(arr[i] + " ");
        }
		System.out.println("");
	}
}

// Input:
// 6
// 8 -6 6 -8 4 2
  
// Output:
// 2 -6 4 -8 6 8 
