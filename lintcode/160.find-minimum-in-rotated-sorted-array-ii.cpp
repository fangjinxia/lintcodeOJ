class Solution {
public:
    /**
     * @param num: the rotated sorted array
     * @return: the minimum number in the array
     */
    int findMin(vector<int> &num) {
        int lo = 0; 
        int hi = num.size()-1;
        
        while(lo < hi){
            if(num[lo] < num[hi])
                return num[lo];
            int mid = lo + (hi - lo) / 2;
            if(num[mid] > num[hi])
                lo = mid+1;
            else if(num[mid] < num[hi]){
                hi = mid;
            }
            else
                --hi;
        }
        
        return num[lo];
    }
};