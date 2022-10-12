// two Given Sorted arrays arr1 ={10,15,20,5,30} and arr 2 ={30,5,30,80}, count the number of common elements present in the array
// Time Complexity = O(n1 + n2)

import java.io.*;
import java.util.*;
 
class Main {
    static void findCommon(int arr[], int arr2[], int n1, int n2)
    {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < n2; i++) {
           if(set.contains(arr2[i])) 
           {
               if(set2.contains(arr2[i])== false)
                    System.out.print(arr2[i]+" ");
                set2.add(arr2[i]);
            }
        }
    }
 
    public static void main(String args[])
    {
        int arr[] = { 1, 5, 10, 20, 40, 80, 110, 150, 167, 189 };
        int arr2[] = { 6, 7, 20, 80, 100, 120, 158, 167, 185, 211 };
        int n1 = ar1.length;
        int n2 = ar2.length;
     
        System.out.println("Common Elements are ");
        findCommon(arr, arr2, n1, n2);
    }
}

-----------------
  //2nd solution
----------------
  Time complexity: O(n1(log n2)

import java.io.*;
import java.util.*;
 
class Main {
    public static boolean binary_search(int arr[], int n, int element)
    {
        int l = 0, h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == element) {
                return true;
            }
            else if (arr[mid] > element) {
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return false;
    }
     
    public static void findCommon(int a[], int b[], int n1, int n2)
    {
        // Iterate on first array
        for (int j = 0; j < n1; j++)
        {
           if (j != 0 && a[j] == a[j - 1]) {
                continue;
            }
            // check if the element is present in 2nd 
            // array.
            if (binary_search(b, n2, a[j])) 
            {
                System.out.print(a[j] + " "); 
            }
        }
    }
       
    public static void main(String args[])
    {
        int ar1[] = { 1, 5, 10, 20, 40,  110, 150, 167, 189 };
        int ar2[] = { 6, 7, 20,  100, 120, 158, 167, 185, 211 };
        int n1 = ar1.length;
        int n2 = ar2.length;
     
        System.out.println("Common Elements are ");
        findCommon(ar1, ar2, n1, n2);
    }
}
