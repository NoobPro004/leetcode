/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 *
 * https://leetcode.com/problems/power-of-three/description/
 *
 * algorithms
 * Easy (45.40%)
 * Likes:    2479
 * Dislikes: 238
 * Total Accepted:    659.8K
 * Total Submissions: 1.5M
 * Testcase Example:  '27'
 *
 * Given an integer n, return true if it is a power of three. Otherwise, return
 * false.
 * 
 * An integer n is a power of three, if there exists an integer x such that n
 * == 3^x.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 27
 * Output: true
 * Explanation: 27 = 3^3
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 0
 * Output: false
 * Explanation: There is no x where 3^x = 0.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: n = -1
 * Output: false
 * Explanation: There is no x where 3^x = (-1).
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * -2^31 <= n <= 2^31 - 1
 * 
 * 
 * 
 * Follow up: Could you solve it without loops/recursion?
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        //         if(n<=0)return false;
        
//         while(n>1){
//             if(n%4!=0)return false;
            
//             n/=4;
//         }
        
//         return true;
       return (Math.log(n) / Math.log(4)) % 1 == 0;
    }
}
// @lc code=end

