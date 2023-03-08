/*
 * @lc app=leetcode id=504 lang=java
 *
 * [504] Base 7
 *
 * https://leetcode.com/problems/base-7/description/
 *
 * algorithms
 * Easy (48.27%)
 * Likes:    637
 * Dislikes: 207
 * Total Accepted:    103.4K
 * Total Submissions: 213.8K
 * Testcase Example:  '100'
 *
 * Given an integer num, return a string of its base 7 representation.
 * 
 * 
 * Example 1:
 * Input: num = 100
 * Output: "202"
 * Example 2:
 * Input: num = -7
 * Output: "-10"
 * 
 * 
 * Constraints:
 * 
 * 
 * -10^7 <= num <= 10^7
 * 
 * 
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        if(num<0)return "-" + convertToBase7(-num);
        
        if(num<7)return  num+"";
        return convertToBase7(num/7)+num%7+"";
    }
}
// @lc code=end

