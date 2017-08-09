class Solution {
public:
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    vector<int> mergeSortedArray(vector<int> &A, vector<int> &B) {
        // write your code here
        vector<int> v(0);
        int i = 0, j = 0; 
        for(; i < A.size() && j < B.size(); ){
            if(A[i] < B[j])
                v.push_back(A[i++]);
            else
                v.push_back(B[j++]);
        }
        
        while(i != A.size()){
            v.push_back(A[i++]);
        }
        
        while(j != B.size()){
            v.push_back(B[j++]);
        }
        
        return v;
    }
};