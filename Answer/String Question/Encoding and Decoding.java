// given a string, write the logic for compressing it

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void encoding(String str)
    {
        int n = str.length();
        for (int i = 0; i < n; i++) 
        {

            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) 
            {
                count++;
                i++;
            }
            System.out.print(str.charAt(i) + "" + count);
        }
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        encoding(str);
    }
}


// stdin:
// wwwwaaadexxxxxxywww

// stdout:
// w4a3d1e1x6y1w3

