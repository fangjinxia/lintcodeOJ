package test;


import java.util.*;
import java.lang.String;

public class partitionArray {
	/*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
    	int n = nums.length;
        if(nums == null || n == 0)
        	return ;
        
        int low = 0, high = n-1;
        while(low < high) {
        	//odd number
        	while(low < high && ((nums[low]&1) == 1)) {
        		++low;
        	}
        	//even n7umber
        	while(low < high && ((nums[high]&1) == 0)) {
        		--high;
        	}
        	
        	if(low < high) {
        		int tmp = nums[low];
        		nums[low] = nums[high];
        		nums[high] = tmp;
        	}
        }
    }
}
 