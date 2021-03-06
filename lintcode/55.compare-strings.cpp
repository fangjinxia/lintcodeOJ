class Solution {
public:
    /**
     * @param A: A string includes Upper Case letters
     * @param B: A string includes Upper Case letter
     * @return:  if string A contains all of the characters in B return true 
     *           else return false
     */
    bool compareStrings(string A, string B) {
        // write your code here
        if(A.length() < B.length())
            return false;
            
        vector<int> count(26, 0);
        for(auto c : A){
            ++count[c - 'A'];
        }
        for(auto c : B){
            if(count[c - 'A'] == 0)
                return false;
            --count[c - 'A'];
        }
        return true;
    }
};
