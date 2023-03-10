/*
 * @lc app=leetcode id=1221 lang=java
 *
 * [1221] Split a String in Balanced Strings
 *
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
 *
 * algorithms
 * Easy (85.03%)
 * Likes:    2276
 * Dislikes: 847
 * Total Accepted:    239K
 * Total Submissions: 280.8K
 * Testcase Example:  '"RLRRLLRLRL"'
 *
 * Balanced strings are those that have an equal quantity of 'L' and 'R'
 * characters.
 * 
 * Given a balanced string s, split it into some number of substrings such
 * that:
 * 
 * 
 * Each substring is balanced.
 * 
 * 
 * Return the maximum number of balanced strings you can obtain.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring
 * contains same number of 'L' and 'R'.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "RLRRRLLRLL"
 * Output: 2
 * Explanation: s can be split into "RL", "RRRLLRLL", each substring contains
 * same number of 'L' and 'R'.
 * Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the
 * 2^nd and 5^th substrings are not balanced.
 * 
 * Example 3:
 * 
 * 
 * Input: s = "LLLLRRRR"
 * Output: 1
 * Explanation: s can be split into "LLLLRRRR".
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= s.length <= 1000
 * s[i] is either 'L' or 'R'.
 * s is a balanced string.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int ans=0;
        for(char c:s.toCharArray()){
            if(c=='L'){
                count++;
            }else count--;
            
            if(count==0)ans++;
        }
        
        return ans;
    }
}
// @lc code=end

