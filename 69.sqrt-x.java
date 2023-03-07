/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 *
 * https://leetcode.com/problems/sqrtx/description/
 *
 * algorithms
 * Easy (37.28%)
 * Likes:    5999
 * Dislikes: 3922
 * Total Accepted:    1.4M
 * Total Submissions: 3.7M
 * Testcase Example:  '4'
 *
 * Given a non-negative integer x, return the square root of x rounded down to
 * the nearest integer. The returned integer should be non-negative as well.
 * 
 * You must not use any built-in exponent function or operator.
 * 
 * 
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down
 * to the nearest integer, 2 is returned.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 0 <= x <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x<=1)return x;
        int l=1;
        int h=x/2;
        int ans=-1;
        while(l<=h){
            long mid=l+(h-l)/2;
            if(mid*mid==x)return (int)mid;
            else if(mid*mid<x){
                ans=(int)mid;
                l=(int)mid+1;
            }else h=(int)mid-1;
        }
        
        return ans;
    }
}
// @lc code=end

