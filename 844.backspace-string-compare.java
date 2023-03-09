/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 *
 * https://leetcode.com/problems/backspace-string-compare/description/
 *
 * algorithms
 * Easy (48.03%)
 * Likes:    6141
 * Dislikes: 282
 * Total Accepted:    611.7K
 * Total Submissions: 1.3M
 * Testcase Example:  '"ab#c"\n"ad#c"'
 *
 * Given two strings s and t, return true if they are equal when both are typed
 * into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length, t.length <= 200
 * s and t only contain lowercase letters and '#' characters.
 * 
 * 
 * 
 * Follow up: Can you solve it in O(n) time and O(1) space?
 * 
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        int skipi=0;
        int skipj=0;
        while(i>=0 || j>=0){
            while(i>=0){
                if(s.charAt(i)=='#'){
                    skipi++;
                    i--;
                }else if(skipi>0){
                    skipi--;
                    i--;
                }else break;
            }
            
            while(j>=0){
                if(t.charAt(j)=='#'){
                    skipj++;
                    j--;
                }else if(skipj>0){
                    skipj--;
                    j--;
                }else break;
            }
            
            if(i>=0 && j>=0){
                if(s.charAt(i)!=t.charAt(j))return false;
            }
            if(i<0 && j<0)return true;
            if(i<0 || j<0)return false;
            
            i--;
            j--;
        }
        
        return true;
    }
}
// @lc code=end

