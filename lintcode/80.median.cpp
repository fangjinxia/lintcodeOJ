class Solution {
public:
    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    int median(vector<int> &nums) {
        // write your code here
        sort(nums.begin(), nums.end());
        int n = nums.size();
        int idx = (n % 2 == 1) ? (n/2) : ((n-1)/2);
        return nums[idx];
    }
};
