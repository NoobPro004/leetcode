/*
 * @lc app=leetcode id=1047 lang=java
 *
 * [1047] Remove All Adjacent Duplicates In String
 *
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
 *
 * algorithms
 * Easy (69.88%)
 * Likes:    5496
 * Dislikes: 216
 * Total Accepted:    429.5K
 * Total Submissions: 615.6K
 * Testcase Example:  '"abbaca"'
 *
 * You are given a string s consisting of lowercase English letters. A
 * duplicate removal consists of choosing two adjacent and equal letters and
 * removing them.
 * 
 * We repeatedly make duplicate removals on s until we no longer can.
 * 
 * Return the final string after all such duplicate removals have been made. It
 * can be proven that the answer is unique.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "abbaca"
 * Output: "ca"
 * Explanation: 
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent
 * and equal, and this is the only possible move.  The result of this move is
 * that the string is "aaca", of which only "aa" is possible, so the final
 * string is "ca".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "azxxzy"
 * Output: "ay"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 10^5
 * s consists of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                while(!stack.isEmpty() && stack.peek()==s.charAt(i))stack.pop();
            }else stack.push(s.charAt(i));
            
        }
        
        StringBuilder ans=new StringBuilder();
        while(!stack.isEmpty())ans.append(stack.pop()+"");
        
        return ans.reverse().toString();
    }
}
// @lc code=end

