// 1st method 
// swap array and found 2nd largest element

public class Main{  
  public static int getSecondLargest(int[] arr, int total){  
  int temp;  
  for (int i = 0; i < total; i++)   
      {  
          for (int j = i + 1; j < total; j++)   
          {  
              if (a[i] > a[j])   
              {  
                  temp = a[i];  
                  a[i] = a[j];  
                  a[j] = temp;  
              }  
          }  
      }  
     return a[total-2];  
  }  
  
  public static void main(String args[]){  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println(getSecondLargest(arr,n));
  }
}



//2nd method 
// Find 2nd Largest Number in Array using Collections

public class Main{  
  public static int getSecondLargest(Integer[] arr, int total){  
    List<Integer> list=Arrays.asList(a);  
    Collections.sort(list);  
    int element=list.get(total-2);  
    return element;  
   }  
  public static void main(String args[]){  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println(getSecondLargest(arr,n));
  }
}
 


// Input : (sorted array and given output)
// 6
// 1,2,5,6,3,2
  
// output:
// 5
