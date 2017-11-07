package test;


import java.util.*;
import java.lang.String;

public class removeDuplicates {
	/**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
		if(nums == null || n == 0)
			return 0;
		int res = 2;
		for(int i = 2; i < n; ++i) {
			if(nums[i] != nums[res-2] || nums[i] != nums[res-1]) {
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
 