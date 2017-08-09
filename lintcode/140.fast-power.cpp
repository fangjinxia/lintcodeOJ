class Solution {
public:
    /*
     * @param a, b, n: 32bit integers
     * @return: An integer
     */
    int fastPower(int a, int b, int n) {
        if(n == 0)
            return 1 % b;
        if(n == 1)
            return a % b;
        long long tmp = fastPower(a, b, n>>1);
        if(n % 2 == 1)
            return (((tmp * tmp) % b) * a) % b;
        else
            return (tmp*tmp) % b;
    }
};