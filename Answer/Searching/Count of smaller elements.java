// Number of element smaller than a given number in a sorted array. (binary search)

// 1st method using binary search

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static int binarySearchCount(int arr[], int n, int key)
    {
        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left <= right)
        {
            int mid = (right + left) / 2;
            // Check if middle element is less then or not
            if (arr[mid] < key)
            {
                // At least (mid + 1) elements are there // whose values are less than  // or equal to key
                count = mid + 1;
                left = mid + 1;
            }

            // If key is smaller, ignore right half
            else
                right = mid - 1;
        }
        return count;
    }
 
    public static void main (String[] args)
    {
        int arr[] = { 1, 2, 4, 11, 11, 16 };
        int key = 11;
        int n = arr.length;

        System.out.println (binarySearchCount(arr, n, key));
    }
}

// OutPut: 3

----------------
//2nd method
----------------
  
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	  public static int countOfElements(int arr[], int n, int key)
    {
        // here the index is used as count // declared a variable to count
        for (int i = 0; i < n; i++) 
        {
            // break when find
            if (arr[i] >= key)
                break;
        }
        return i;
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 4, 5, 8, 10, 11 };
        int key = 11;
        int n = arr.length;
        System.out.print(countOfElements(arr, n, key));
    }
}

//OutPut : 6
