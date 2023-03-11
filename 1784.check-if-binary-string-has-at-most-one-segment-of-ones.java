/*
 * @lc app=leetcode id=1784 lang=java
 *
 * [1784] Check if Binary String Has at Most One Segment of Ones
 *
 * https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/
 *
 * algorithms
 * Easy (40.20%)
 * Likes:    256
 * Dislikes: 778
 * Total Accepted:    32.1K
 * Total Submissions: 79.9K
 * Testcase Example:  '"1001"'
 *
 * Given a binary string s ​​​​​without leading zeros, return true​​​ if s
 * contains at most one contiguous segment of ones. Otherwise, return false.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "1001"
 * Output: false
 * Explanation: The ones do not form a contiguous segment.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "110"
 * Output: true
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 100
 * s[i]​​​​ is either '0' or '1'.
 * s[0] is '1'.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
// @lc code=end

