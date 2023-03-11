/*
 * @lc app=leetcode id=1758 lang=java
 *
 * [1758] Minimum Changes To Make Alternating Binary String
 *
 * https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/description/
 *
 * algorithms
 * Easy (58.34%)
 * Likes:    505
 * Dislikes: 17
 * Total Accepted:    33.9K
 * Total Submissions: 58.1K
 * Testcase Example:  '"0100"'
 *
 * You are given a string s consisting only of the characters '0' and '1'. In
 * one operation, you can change any '0' to '1' or vice versa.
 * 
 * The string is called alternating if no two adjacent characters are equal.
 * For example, the string "010" is alternating, while the string "0100" is
 * not.
 * 
 * Return the minimum number of operations needed to make s alternating.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "0100"
 * Output: 1
 * Explanation: If you change the last character to '1', s will be "0101",
 * which is alternating.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "10"
 * Output: 0
 * Explanation: s is already alternating.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "1111"
 * Output: 2
 * Explanation: You need two operations to reach "0101" or "1010".
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 10^4
 * s[i] is either '0' or '1'.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int minOperations(String s) {
        int counta=0;
        int countb=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                counta+=(s.charAt(i)=='0' ? 0 : 1);
                countb+=(s.charAt(i)=='0' ? 1 : 0);
            }else{
                counta+=(s.charAt(i)=='1' ? 0 : 1);
                countb+=(s.charAt(i)=='1' ? 1 : 0);
            }
        }
        
        return Math.min(counta,countb);
    }
}
// @lc code=end

