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
      
    public static int removeDuplicates(int res[], int a)
    {
        if(a == 0 || a == 1 )
        {
          return a;
        }
        int j= 0 ;
        
        for(int i = 0; i < a - 1; i++)
        {
            if(res[i] != res [i + 1])
                res[j++] = res [i];
        }
        res[j++] = res [a - 1];
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
