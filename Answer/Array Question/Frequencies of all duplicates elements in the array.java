//Find the frequencies of all duplicates elements in the array

// Input: arr[] = {2, 3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6} 
// Output
// 4 –> 4 
// 5 –> 2 
// 6 –> 3



import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static HashMap<Integer, Integer> findRepeating(int []arr, int n)
	{
	    HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
   
      // Loop to store the frequency of elements of array
	    for(int i = 0; i < n; i++)  
	    {
	        if(frequency.containsKey(arr[i]))
	        {
	            frequency.put(arr[i], frequency.get(arr[i]) + 1);
	        }
	        else
	        {
	            frequency.put(arr[i], 1);
	        }
	    }
	    return frequency;
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
      HashMap<Integer,Integer> frequency = findRepeating(arr, n);
      System.out.print("");
    
      for (Map.Entry<Integer,Integer> entry : frequency.entrySet())
      if (entry.getValue() > 1)
          System.out.println(entry.getKey()+ " : "+entry.getValue());
	}
}
