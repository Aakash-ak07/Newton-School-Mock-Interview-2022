// merge two sorted array without duplicates

import java.io.*;
import java.util.*;
 
class Main
{
    public static void sortArray(int arr[], int arr2[], int res[], int n, int m)
    {
        int i = 0, j = 0, k = 0;
        while (i < n)
        {
            res[k] = arr[i];
            i++;
            k++;
        }
        while (j < m) 
        {
            res[k] = arr2[j];
            j++;
            k++;
        }
        Arrays.sort(res);
    }
      
    public static int removeDuplicates(int arr[], int n)
    {
        // if(array size if 0 or 1 array is already sorted)
        if(n == 0 || n == 1 )
        {
          return n;
        }
        int j= 0 ;
        
        // check if the ith element is not equal to 
        // the (i+1)th element, then add that element
        // at the jth index in the same array
        for(int i = 0; i < n - 1; i++)
        {
            if(arr[i] != arr[i + 1])
                arr[j++] = arr[i];
        }
        arr[j++] = arr[n - 1];
        return j;
    }
      
    public static void main(String[] args) {
        int arr[] = {9,9,10,10,1};
        int arr2[] = {81,71,1,4};
        int n = arr.length;
        int m = arr2.length;   
        int res[] = new int[n + m];
        
        sortArray(arr, arr2, res, n, m);
        System.out.print("Sorted merged list");
        System.out.println("");
        
        for (int i= 0 ; i < n+ m ;i++)
        {
            System.out.print(res[i] +" ");
        }
        System.out.println("");
     
        int h = res.length;
        h = removeDuplicates(res, h);
         
        System.out.println("After removing duplicates");
        for (int i = 0; i < h; i++)
        {
            System.out.print(res[i] + " ");
        }
    }
}

// OutPut:
// Sorted merged list
// 1 1 4 9 9 10 10 71 81 
// After removing duplicates
// 1 4 9 10 71 81 
