package test;


import java.util.*;
import java.lang.String;

public class minimumTotal {
	/*
     * @param triangle: a list of lists of integers
     * @return: An integer, minimum path sum
     */
    public int minimumTotal(int[][] triangle) {
        int n = triangle.length;
        if(n == 0)
        	return 0;
        
        int[] dp = new int[n];
        //初始化
        for(int i = 0; i < n; ++i) {
        	dp[i] = triangle[n-1][i];
        }
        
    	for(int i = n-2; i > 0; --i) {
    		for(int j = 0; j <= i; ++j) {
    			dp[j] = Math.min(dp[j], dp[j+1]) + triangle[i][j];
    		}
    	}
    	
    	return dp[0];
    }
//    public static void swap(int[] nums, int i, int j) {
//    	int tmp = nums[i];
//    	nums[i] = nums[j];
//    	nums[j] = tmp;
//    }
}
 