/*
 * @lc app=leetcode id=1952 lang=java
 *
 * [1952] Three Divisors
 *
 * https://leetcode.com/problems/three-divisors/description/
 *
 * algorithms
 * Easy (57.78%)
 * Likes:    391
 * Dislikes: 19
 * Total Accepted:    42K
 * Total Submissions: 72.3K
 * Testcase Example:  '2'
 *
 * Given an integer n, return true if n has exactly three positive divisors.
 * Otherwise, return false.
 * 
 * An integer m is a divisor of n if there exists an integer k such that n = k
 * * m.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 2
 * Output: false
 * Explantion: 2 has only two divisors: 1 and 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 4
 * Output: true
 * Explantion: 4 has three divisors: 1, 2, and 4.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isThree(int n) {
        int ans=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                ans++;
                int div=n/i;
                if(div!=i)ans++;
            }
        }
        
        return ans==3;
    }
}
// @lc code=end

