class Solution {
public:
    /**
     * @param str: A string
     * @return An integer
     */
    int atoi(string str) {
        // write your code here
        if(str == "")
            return 0;
        
        bool flag = true;
        int i = 0;
        //清除string头部空格
        while(str[i] == ' ')
            ++i;
        if(str[i] == '-'){
            flag = false;
            ++i;
        }
        if(str[i] == '+')
            ++i;
        long long res = 0;
        for(; i < str.length(); ++i){
            if(!isdigit(str[i]))
                break;
            
            res *= 10;
            res += str[i]-'0';
            if(flag && res >= INT_MAX)
                return INT_MAX;
            else if(!flag && res >= 2147483648)
                return INT_MIN;
        }
        
        res = flag ? res : (0-res);
        return res;
    }
};