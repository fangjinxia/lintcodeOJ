package lintcode;
import java.lang.reflect.Array;
import java.util.*;

class Pair{
	int sum;
	int index;
	public Pair(int s, int idx){
		sum = s;
		index = idx;
	}
}

public class subarraySumClosest {
	/*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public int[] subarraySumClosest(int[] nums) {
        int n = nums.length;
        int[] res = new int[2];         
        if(n == 0)
        	return res;
        if(n == 1){
        	res[0] = 0;
        	res[1] = 0;
        	return res;
        }
        
        Pair[] dp = new Pair[n+1];
        dp[0] = new Pair(0, 0);
        int sum = 0;
        for(int i = 0; i < n; ++i){
        	sum += nums[i];
        	dp[i+1] = new Pair(sum, i+1);
        }
        
        Arrays.sort(dp, new Comparator<Pair>(){
        	public int compare(Pair a, Pair b){
        		return a.sum - b.sum;
        	}
        });
        
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i < dp.length; ++i){
        	if(ans > dp[i].sum - dp[i-1].sum){
        		ans = dp[i].sum - dp[i-1].sum;
        		int[] temp = new int[]{dp[i].index - 1, dp[i - 1].index - 1};
                Arrays.sort(temp);
                res[0] = temp[0] + 1;
                res[1] = temp[1];
        	}
        }
        
        return res;
    }
}
