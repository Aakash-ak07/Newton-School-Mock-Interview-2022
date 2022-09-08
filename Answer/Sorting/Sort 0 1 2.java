// Sort 0 1 2

import java.util.*;
import java.lang.*;
import java.io.*;


class Main{
    public static void sortZeroOneTwo(int arr[], int n){
       int count[]=new int[3];
       for(int i = 0; i < n; i++)
       {
           count[arr[i]]++;
       }
       int i = 0, j = 0;
       while(i < n)
       {
           if(count[j] != 0)
           {
               arr[i++] = j;
               count[j]--;
           } 
           else 
           {
               j++;
           }
    	}
	}
	public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] =sc.nextInt();
        }
        sortZeroOneTwo(arr, n);
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }   
    }
}
