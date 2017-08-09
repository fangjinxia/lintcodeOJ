class Solution {
public:
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    int strStr(const char *source, const char *target) {
        // write your code here
        if(!source || !target)
            return -1;
        string s = source;
        string t = target;
        auto idx = s.find(t, 0);
        if(idx != string::npos)
            return idx;
        
        return -1;
    }
};
