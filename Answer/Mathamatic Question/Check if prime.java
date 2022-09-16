//Given an integer, print whether that integer is a prime number or not.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static boolean isPrime(int n)
    {
        if(n<=1)
           return false;
        for(int i = 2; i<=Math.sqrt(n); i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            if(isPrime(n))
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    
    }
}

// Sample Input
// 3
// 5
// 9
// 13

// Output
// Yes
// No
// Yes
