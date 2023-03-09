/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 *
 * https://leetcode.com/problems/number-of-segments-in-a-string/description/
 *
 * algorithms
 * Easy (37.37%)
 * Likes:    624
 * Dislikes: 1132
 * Total Accepted:    140K
 * Total Submissions: 376K
 * Testcase Example:  '"Hello, my name is John"'
 *
 * Given a string s, return the number of segments in the string.
 * 
 * A segment is defined to be a contiguous sequence of non-space characters.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "Hello, my name is John"
 * Output: 5
 * Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "Hello"
 * Output: 1
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 0 <= s.length <= 300
 * s consists of lowercase and uppercase English letters, digits, or one of the
 * following characters "!@#$%^&*()_+-=',.:".
 * The only space character in s is ' '.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        int ans=0;
         for(int i=0;i<s.length();i++){
             if((i==0 || s.charAt(i-1)==' ') && s.charAt(i)!=' ')ans++;
         }
        
        return ans;
    }
}
// @lc code=end

