/*
 * @lc app=leetcode id=1446 lang=java
 *
 * [1446] Consecutive Characters
 *
 * https://leetcode.com/problems/consecutive-characters/description/
 *
 * algorithms
 * Easy (61.37%)
 * Likes:    1491
 * Dislikes: 29
 * Total Accepted:    137.2K
 * Total Submissions: 223.7K
 * Testcase Example:  '"leetcode"'
 *
 * The power of the string is the maximum length of a non-empty substring that
 * contains only one unique character.
 * 
 * Given a string s, return the power of s.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "leetcode"
 * Output: 2
 * Explanation: The substring "ee" is of length 2 with the character 'e'
 * only.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "abbcccddddeeeeedcba"
 * Output: 5
 * Explanation: The substring "eeeee" is of length 5 with the character 'e'
 * only.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 500
 * s consists of only lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maxPower(String s) {
        int start=0;
        int max=0;
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)!=s.charAt(start)){
                 max=Math.max(max,i-start);
                 start=i;
             }
         }
        
        max=Math.max(max,s.length()-start);
        return max;
    }
}
// @lc code=end

