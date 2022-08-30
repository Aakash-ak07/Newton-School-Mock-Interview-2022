Time Complexity: O(n)
Auxiliary Space : O(n)

class main
{
	public static void posNegPair(int[] arr, int n)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) 
		{
            if (hs.contains((arr[i]) * -1))
            {
            	if (arr[i] < 0) 
            	{
            		System.out.print(arr[i]+ " ");
                    System.out.print((arr[i] * -1) + " ");
            	}
            	else
            	{
            		 System.out.print((arr[i] * -1)+ " ");
                    System.out.print(arr[i]+ " ");
            	}
            }
            hs.add(arr[i]);
		}
		// return;
	}
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		posNegPair(arr,n);	
	}
}


// I/P-arr[]={1,-3,2,3,6,-1}
// O/P=-1,1,-3,3
