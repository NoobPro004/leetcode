/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 *
 * https://leetcode.com/problems/valid-perfect-square/description/
 *
 * algorithms
 * Easy (43.31%)
 * Likes:    3371
 * Dislikes: 274
 * Total Accepted:    465.5K
 * Total Submissions: 1.1M
 * Testcase Example:  '16'
 *
 * Given a positive integer num, return true if num is a perfect square or
 * false otherwise.
 * 
 * A perfect square is an integer that is the square of an integer. In other
 * words, it is the product of some integer with itself.
 * 
 * You must not use any built-in library function, such as sqrt.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: num = 16
 * Output: true
 * Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: num = 14
 * Output: false
 * Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an
 * integer.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= num <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)return true;
        if(num<=0)return false;
        
        long l=1;
        long h=num;
        while(l<=h){
            long mid=l+(h-l)/2;
            if(mid*mid==num)return true;
            else if(mid*mid<num)l=mid+1;
            else h=mid -1;
        }
        
        return false;
    }
}
// @lc code=end

