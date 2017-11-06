package lintcode;

public class Subarray_Sum {
	/*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public class Solution {
    /*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> subarraySum(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        if(n == 0)
        	return res;
        
        int sum = 0;
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(0, 0);
        for(int i = 0; i < n; ++i){
        	sum += nums[i];
        	if(dp.containsKey(sum)){
        		res.add(dp.get(sum));
        		res.add(i);
        		break;
        	}
        	dp.put(sum, i+1);        	
        }
        
        return res;
    }
}
}
