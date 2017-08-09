class Solution {
public:
    /*
     * param k : description of k
     * param nums : description of array and index 0 ~ n-1
     * return: description of return
     */
    int kthLargestElement(int k, vector<int> nums) {
        // write your code here
        int maxNum = *max_element(nums.begin(), nums.end());
        vector<int> v(maxNum+1, 0);
        for(int i = 0; i < nums.size(); ++i){
            ++v[nums[i]];
        }
        
        for(int i = maxNum; i >= 0; --i){
            if(v[i] >= k)
                return i;
            k -= v[i];
        }
        
        return 0;
    }
};