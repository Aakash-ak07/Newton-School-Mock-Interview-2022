// We are given two arrays ar1[0…m-1] and ar2[0..n-1] and a number x, 
// we need to find the pair ar1[i] + ar2[j] such that absolute value of (ar1[i] + ar2[j] – x) is minimum."

Input:  ar1[] = {1, 4, 5, 12};
        ar2[] = {10, 20, 30, 40};
        x = 32      
Output:  1 and 30

Input:  ar1[] = {1, 4, 5, 7};
        ar2[] = {10, 20, 30, 40};
        x = 50      
Output:  7 and 40
  
  
class ClosestPair 
{ 
    public static void printClosest(int ar1[], int ar2[], int m, int n, int x) 
    { 
        // Initialize the diff between pair sum and x. 
        int diff = Integer.MAX_VALUE; 
        // resLeft and resRight are result indexes from ar1[] and ar2[] 
        int resLeft = 0, resRight = 0; 
  
        // Start from left side of ar1[] and right side of ar2[] 
        int l = 0, r = n-1; 
        while (l < m && r >= 0) 
        { 
           // If this pair is closer to x than the previously 
           // found closest, then update resLeft, resRight and diff 
           if (Math.abs(ar1[l] + ar2[r] - x) < diff) 
           { 
               resLeft = l; 
               resRight = r; 
               diff = Math.abs(ar1[l] + ar2[r] - x); 
           } 
  
           // If sum of this pair is more than x, move to smaller 
           // side 
           if (ar1[l] + ar2[r] > x) 
               r--; 
           else  // move to the greater side 
               l++; 
        } 
        System.out.print("Closest Pair : [" + ar1[resLeft] + ", " + ar2[resRight] + "]"); 
    } 
  
    public static void main(String args[]) 
    {  
        int ar1[] = {1, 4, 5, 7}; 
        int ar2[] = {10, 20, 30, 40}; 
        int m = ar1.length; 
        int n = ar2.length; 
        int x = 38; 
        printClosest(ar1, ar2, m, n, x); 
    } 
} 

------------------
//2nd Solution
------------------
  
  public static void minDiff(int arr1[], int arr2[], int n, int x) {
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      int i = 0, j = n - 1, minDifference = Integer.MAX_VALUE;
      int tempI = 0;
      int tempJ = 0;
      // Start from left side of arr1[] and right side of arr2[] 
      while (i < n && j >= 0) 
      {
          // If this pair is closer to x than the previously 
           // found closest, then update tempI, tempJ and minDiff... 
          int ans = Math.abs(arr1[i] + arr2[j] - x);
          if (ans < minDifference) 
          {
              tempI = i;
              tempJ = j;
              minDifference = ans;
          }
          // If sum of this pair is more than x, move to smaller 
          if (arr1[i] + arr2[j] < x)
              i++;
          else
              j--;
      }
      System.out.println(arr1[tempI] + "," + arr2[tempJ]);
  }
