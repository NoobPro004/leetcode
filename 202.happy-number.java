/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 *
 * https://leetcode.com/problems/happy-number/description/
 *
 * algorithms
 * Easy (54.71%)
 * Likes:    8190
 * Dislikes: 1026
 * Total Accepted:    1.1M
 * Total Submissions: 2M
 * Testcase Example:  '19'
 *
 * Write an algorithm to determine if a number n is happy.
 * 
 * A happy number is a number defined by the following process:
 * 
 * 
 * Starting with any positive integer, replace the number by the sum of the
 * squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it
 * loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * 
 * 
 * Return true if n is a happy number, and false if not.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 2
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=getNext(n);
        while(fast!=1 && slow!=fast){
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }
        
        return fast==1;
    }
    
    public int getNext(int n){
        int a=0;
        while(n>0){
            int x=n%10;
            n/=10;
            a+=x*x;
        }
        
        return a;
    }
}
// @lc code=end

