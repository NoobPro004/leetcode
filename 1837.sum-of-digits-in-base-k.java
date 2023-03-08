/*
 * @lc app=leetcode id=1837 lang=java
 *
 * [1837] Sum of Digits in Base K
 *
 * https://leetcode.com/problems/sum-of-digits-in-base-k/description/
 *
 * algorithms
 * Easy (76.96%)
 * Likes:    407
 * Dislikes: 32
 * Total Accepted:    38.2K
 * Total Submissions: 49.7K
 * Testcase Example:  '34\n6'
 *
 * Given an integer n (in base 10) and a base k, return the sum of the digits
 * of n after converting n from base 10 to base k.
 * 
 * After converting, each digit should be interpreted as a base 10 number, and
 * the sum should be returned in base 10.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 34, k = 6
 * Output: 9
 * Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 10, k = 10
 * Output: 1
 * Explanation: n is already in base 10. 1 + 0 = 1.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 100
 * 2 <= k <= 10
 * 
 * 
 */

// @lc code=start
class Solution {
    public int sumBase(int n, int k) {
        int ans=0;
        while(n>0){
            ans+=n%k;
            n/=k;
        }
        
        return ans;
    }
}
// @lc code=end

