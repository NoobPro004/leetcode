/*
 * @lc app=leetcode id=2427 lang=java
 *
 * [2427] Number of Common Factors
 *
 * https://leetcode.com/problems/number-of-common-factors/description/
 *
 * algorithms
 * Easy (79.90%)
 * Likes:    359
 * Dislikes: 6
 * Total Accepted:    43.8K
 * Total Submissions: 54.9K
 * Testcase Example:  '12\n6'
 *
 * Given two positive integers a and b, return the number of common factors of
 * a and b.
 * 
 * An integer x is a common factor of a and b if x divides both a and b.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: a = 12, b = 6
 * Output: 4
 * Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: a = 25, b = 30
 * Output: 2
 * Explanation: The common factors of 25 and 30 are 1, 5.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= a, b <= 1000
 * 
 * 
 */

// @lc code=start
class Solution {
    public int commonFactors(int a, int b) {
        int ans=0;
        int max=gcd(a,b);
        for(int i=1;i<=max;i++){
            if(a%i==0 && b%i==0)ans++;
        }
        
        return ans;
    }
    
    public int gcd(int x,int y){
        if(x==0)return y;
        
        return gcd(y%x,x);
    }
}
// @lc code=end

