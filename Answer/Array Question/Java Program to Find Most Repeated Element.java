// Java Program to Find Most Repeated Element
// Time Complexity O(nlogn)


import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) 
	{
		  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
      {
          arr[i] = sc.nextInt();
      }
      int element = Integer.MIN_VALUE, max_count=1, count=1;
      Arrays.sort(arr);
      for(int i=1; i<arr.length; i++)
      {
          if(arr[i] == arr[i-1])
              count++;

          if(arr[i] != arr[i-1] || i==arr.length-1)
          {
              if(count>max_count){
                  max_count = count;
                  element = arr[i-1];
              } 
              count =1;
          }
      }
      System.out.println(element+": "+max_count);    
	}
}

// Input:
// 8
// 2 2 5 9 8 7 2 2

// Output:
// 2 : 4
