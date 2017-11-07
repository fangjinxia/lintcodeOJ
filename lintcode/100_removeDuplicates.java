package test;


import java.util.*;
import java.lang.String;

public class removeDuplicates {
	/*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
		if(nums == null || n == 0)
			return 0;
		int res = 1;
		for(int i = 1; i < n; ++i) {
			if(nums[i] != nums[i-1]) {
				nums[res++] = nums[i];
			}
		}
		
		return res;
    }
//    public static void swap(int[] nums, int i, int j) {
//    	int tmp = nums[i];
//    	nums[i] = nums[j];
//    	nums[j] = tmp;
//    }
}
 