
class main
{
	public static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];
 
            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                    "Pair with given sum "
                    + sum + " is (" + arr[i]
                    + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		printpairs(arr, k);
	}
}


// input  
// 6 9
// 1 2 3 4 5 6

// output
// 3,6 and 4,5
