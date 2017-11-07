package test;


import java.util.*;
import java.lang.String;

public class partitionArray {
	/*
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        int n = nums.length;
        if(nums == null || n == 0) {
        	return -1;
        }
        return kth(nums, 0, n-1, (n+1)/2);
    }
    
    public static int kth(int[] nums, int left, int right, int k) {
    	if(left >= right) {
    		return nums[right];
    	}
    	
    	int m = left;
    	for(int i = left+1; i <= right; ++i) {
    		if(nums[i] < nums[left]) {
    			++m;
    			swap(nums, i, m);
    		}
    	}
    	
    	swap(nums, m, left);
    	if(k == m+1) {
    		return nums[m];    		
    	}
    	else if(k > m+1) {
    		return kth(nums, m+1, right, k);
    	}
    	else {
    		return kth(nums, left, m-1, k);
    	}
    }
    
    public static void swap(int[] nums, int i, int j) {
    	int tmp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = tmp;
    }
}
 