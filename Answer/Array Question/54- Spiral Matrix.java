// Given an m x n matrix, return all elements of the matrix in spiral order.
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

// Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]

// Constraints:
// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 10
// -100 <= matrix[i][j] <= 100 

---------------------
//leet code solution
---------------------
import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
    public static void main(String[] args) 
    { 
        int a[][] = {{1,2,3,4,21},
                    {5,6,7,8,22},
                    {9,10,11,12,23},
                    {13,14,15,16,24},
                    {17,18,19,20,25}};
        // spiralMatrixPrint(a);
        System.out.println(spiralOrder(a)); 
    } 

    public static List<Integer> spiralOrder(int[][] matrix) {
        int i, k = 0, l = 0;
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
 
        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                ans.add(matrix[k][i] );
            }
            k++;
 
            // Print the last column from the remaining  // columns
            for (i = k; i < m; ++i) {
                ans.add(matrix[i][n - 1] );
            }
            n--;
 
            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    ans.add(matrix[m - 1][i]);
                }
                m--;
            }
 
            // Print the first column from the remaining  // columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    ans.add(matrix[i][l]);
                }
                l++;
            }
        }
        return ans;
    }      
}

-----------------
//Other Solution
-----------------

import java.util.*;
import java.lang.*;
import java.io.*;

public class SprialMatrix {
    public static void spiralMatrixPrint(int[][] arr) 
    {
        int rows = arr.length;
        int cols = arr[0].length;
        // Defining the boundaries of the matrix.
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
      
        // Defining the direction in which the array is to be traversed.
        int dir = 1;
     
        while (top <= bottom && left <= right) 
        {
            if (dir == 1) {    // moving left->right
                for (int i = left; i <= right; ++i) {
                    System.out.print(arr[top][i] + " ");
                }
                // Since we have traversed the whole first  // row, move down to the next row.
                ++top;
                dir = 2;
            } 
            else if (dir == 2) {     // moving top->bottom
                for (int i = top; i <= bottom; ++i) {
                    System.out.print(arr[i][right]+ " ");
                }
                // Since we have traversed the whole last // column, move left to the previous column.
                --right;
                dir = 3;
            } 
            else if (dir == 3) {     // moving right->left
                for (int i = right; i >= left; --i) {
                    System.out.print(arr[bottom][i]+ " ");
                }
                // Since we have traversed the whole last // row, move up to the previous row.
                --bottom;
                dir = 4;
            } 
            else if (dir == 4) {     // moving bottom->up
                for (int i = bottom; i >= top; --i) {
                    System.out.print(arr[i][left]+ " ");
                }
                // Since we have traversed the whole first  // col, move right to the next column.
                ++left;
                dir = 1;
            }  
        }
    }
}
  
