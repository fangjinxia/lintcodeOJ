package test;


import java.util.*;
import java.lang.String;

public class backPack {
	/**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
    	int n = A.length;
        Boolean[][] dp = new Boolean[n+1][m+1];       
        for(int i = 0; i <= m; ++i) {
        	dp[0][i] = false;
        }
        for(int i = 0; i <= n; ++i) {
        	dp[i][0] = true;
        }
        for(int i = 1; i <= n; ++i) {
        	for(int j = 0; j <= m; ++j) {
        		if(j < A[i-1]) {
        			dp[i][j] = dp[i-1][j];
        		}
        		else {
        			dp[i][j] = dp[i-1][j] || dp[i-1][j-A[i-1]];
        		}
        	}
        }
        
        for(int i = m; i >= 0; --i) {
        	if(dp[n][i])
        		return i;
        }
        
        return 0;
    }
    
//    public static void swap(int[] nums, int i, int j) {
//    	int tmp = nums[i];
//    	nums[i] = nums[j];
//    	nums[j] = tmp;
//    }
}
 