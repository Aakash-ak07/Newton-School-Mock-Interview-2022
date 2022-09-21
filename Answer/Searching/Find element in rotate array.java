// Search an element in a sorted and rotated Array
// Time Complexity: O(log N)
// Space Complexity: O(1)

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static int search(int arr[], int left, int right, int key)
    {
    	if (left > right)
            return -1;
 
        int mid = (left + right) / 2;
        if (arr[mid] == key)
            return mid;
 
        /* If arr[l...mid] first subarray is sorted */
        if (arr[left] <= arr[mid]) 
        {
	       //left part sorted....
            if (key >= arr[left] && key <= arr[mid])
                return search(arr, left, mid - 1, key);
            
            return search(arr, mid + 1, right, key);
        }
	  //right part sorted....
        if (key >= arr[mid] && key <= arr[right])
            return search(arr, mid + 1, right, key);
 
        return search(arr, left, mid - 1, key);
    }
    
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int key = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
        	arr[i] = sc.nextInt();	
        }
        int result = search(arr, 0, n - 1, key);
        if (result != -1)
            System.out.println (result);
        else
            System.out.println("Key not found");
    }
}


// Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; key = 3
// Output : Found at index 8

// Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}; key = 30
// Output : Not found

// Input : arr[] = {30, 40, 50, 10, 20}; key = 10  
// Output : Found at index 3
