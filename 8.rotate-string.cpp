class Solution {
public:
    /**
     * @param str: a string
     * @param offset: an integer
     * @return: nothing
     */
    void rotateString(string &str,int offset){
        //wirte your code here
        int n = str.length();
        if(n == 0)
            return ;
        offset %= n;
        if(offset == 0 || n == 0)
            return ;
        string s = str + str;
        str = s.substr(n-offset, n);
    }
};
