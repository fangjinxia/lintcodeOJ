class Solution {
public:    
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    int longestCommonSubstring(string &A, string &B) {
        // write your code here
        int n = A.length();
        int m = B.length();
        
        int res = 0;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                int len = 0;
                while(i+len < n && j+len < m && A[i+len] == B[j+len]){
                    ++len;
                }
                res = max(res, len);
            }
        }
        
        return res;
    }
};
