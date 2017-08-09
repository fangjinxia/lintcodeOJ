class Solution {
public:
    /**
     * @param nums: The integer array.
     * @param target: Target number to find.
     * @return: The first position of target. Position starts from 0. 
     */
    int binarySearch(vector<int> &array, int target) {
        // write your code here
        int lo = 0; 
        int hi = array.size()-1;
        while(lo < hi){
            int mid = lo + (hi-lo)/2;
            if(array[mid] < target)
                lo = mid+1;
            else
                hi = mid;
        }
        if(array[lo] == target)
            return lo;
        if(array[hi] == target)
            return hi;
        return -1;
    }
};