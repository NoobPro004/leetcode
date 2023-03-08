/*
 * @lc app=leetcode id=2413 lang=java
 *
 * [2413] Smallest Even Multiple
 *
 * https://leetcode.com/problems/smallest-even-multiple/description/
 *
 * algorithms
 * Easy (87.81%)
 * Likes:    516
 * Dislikes: 51
 * Total Accepted:    74.8K
 * Total Submissions: 85.3K
 * Testcase Example:  '5'
 *
 * Given a positive integer n, return the smallest positive integer that is a
 * multiple of both 2 and n.
 * 
 * Example 1:
 * 
 * 
 * Input: n = 5
 * Output: 10
 * Explanation: The smallest multiple of both 5 and 2 is 10.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 6
 * Output: 6
 * Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number
 * is a multiple of itself.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 150
 * 
 * 
 */

// @lc code=start
class Solution {
    public int smallestEvenMultiple(int n) {
        int gc=gcd(2,n);
        return (2*n)/gc;
    }
    
    public int gcd(int x,int y){
        if(x==0)return y;
        return gcd(y%x,x);
    }
    }
}
// @lc code=end

