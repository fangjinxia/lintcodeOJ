class Solution {
public:
    /**
     * @param x the base number
     * @param n the power number
     * @return the result
     */
    double myPow(double x, int n) {
        //n可正可负
        bool flag = (n < 0) ? false : true;
        n = abs(n);
        
        double res = helper(x, n);
        return flag ? res : (1.0 / res);
    }
    
    double helper(double x, int n){
        if(n == 0)
            return 1;
        if(n == 1)
            return x;
        //奇数
        if(n % 2 == 1){
            return x * myPow(x*x, n>>1);
        }
        else{
            return myPow(x*x, n>>1);//偶数
        }
    }
};