package com.Searching;

public class Negative_Number_Sorted2D_Matrix {
    public static void main(String[] args) {
        try {
        int [][] n ={
        {4,3,2,-1},
        {3,2,1,-1},
        {1,1,-1,-2},
        {-1,-1,-2,-3}
        }; 
        // int [][]n={
        //     {3,2},
        //     {1,0}
        // };
        // int [][] n= {
        //     {1,-1},
        //     {-1,-1}
        // };
        // int [][]n={
        //     {-1}
        // };
        // Solution_2Matrix_Negative_Count obj = new Solution_2Matrix_Negative_Count();
        Solution_2Matrix_Negative_Count_Op_A sol = new Solution_2Matrix_Negative_Count_Op_A();

        // int ans = obj.countNegatives(n);
        // System.out.println(ans);
        int result = sol.countNegatives(n);
        System.out.println(result);
        } catch (Exception e) {
            return;
        }
    }
}
class Solution_2Matrix_Negative_Count {
    public int countNegatives(int[][] grid) {
        int count =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]<0)count++;
            }
        }
    return count;    
    }
}
class Solution_2Matrix_Negative_Count_Op_A {
    public int countNegatives(int[][] grid) {
        int count =0;
        int columnpoint = grid[0].length-1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = columnpoint; j >= 0; j--) {
                if(grid[i][j]<0){
                    count+=grid.length-i;
                 columnpoint--;
                }else{
                    break;
                }
            }
        }
    return count;    
    }
}
