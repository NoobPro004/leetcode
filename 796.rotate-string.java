/*
 * @lc app=leetcode id=796 lang=java
 *
 * [796] Rotate String
 *
 * https://leetcode.com/problems/rotate-string/description/
 *
 * algorithms
 * Easy (54.72%)
 * Likes:    2628
 * Dislikes: 108
 * Total Accepted:    198.9K
 * Total Submissions: 361.3K
 * Testcase Example:  '"abcde"\n"cdeab"'
 *
 * Given two strings s and goal, return true if and only if s can become goal
 * after some number of shifts on s.
 * 
 * A shift on s consists of moving the leftmost character of s to the rightmost
 * position.
 * 
 * 
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * 
 * 
 * 
 * Example 1:
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 * Example 2:
 * Input: s = "abcde", goal = "abced"
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length, goal.length <= 100
 * s and goal consist of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        return (s+s).indexOf(goal)!=-1;
    }
}
// @lc code=end

