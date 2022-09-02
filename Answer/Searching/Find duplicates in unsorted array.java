// Find Duplicates in Unsorted Array
// 1st method. Time Complexity = O(N^2)
 
import java.util.*;

class Main
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) 
    {  
        for(int j = i + 1; j < arr.length; j++) 
        {  
            if(arr[i] == arr[j])  
                System.out.println(arr[j]);  
        }  
     }  
	}
}


// 2nd method

public class DuplicateElements {
    public static void main(String args[]) {
        int count, i;
        int[] arr = new int[500];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        for(i = 0; i < count; i++) 
        {
            arr[i] = sc.nextInt();
        }
        // Count frequency of elements in array
        for(Integer val: arr)
        {
            if(map.containsKey(val))
            {
                // Increment counter
                map.put(val, map.get(val)+1);
            } 
            else 
            {
                map.put(val, 1);
            }
        }
        // Check for duplicate element
        System.out.println("");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            if(map.get(key) > 1){
                System.out.print(key + " ");
            }
        }
    }
}


// Input:
// 6
// 3 6 2 3 1 1
// Output:
// 1 3
