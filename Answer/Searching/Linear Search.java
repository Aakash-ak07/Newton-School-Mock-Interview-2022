//Linear Search Time Complexity = O(N)
//this is a sequential search, Every element is checked if a match found then return element, otherwise search continues till end of element.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static int linearSearch(int[] arr, int target, int start, int end) {
      if (arr.length == 0)
          return -1;

      for (int i = start; i <= end; i++) 
      {
          int element = arr[i];
          if (element == target) 
          {
              return i;
          }
      }
      return -1;
  }
  
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
          arr[i] = sc.nextInt();
        }
        int result = linearSearch(arr, target, 0, n-1);
        if (result == -1)
            System.out.print("Element is not present");
        else
            System.out.print("at index "+ result);
    } 
}
