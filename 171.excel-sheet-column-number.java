/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 *
 * https://leetcode.com/problems/excel-sheet-column-number/description/
 *
 * algorithms
 * Easy (61.82%)
 * Likes:    4068
 * Dislikes: 325
 * Total Accepted:    582.1K
 * Total Submissions: 939.9K
 * Testcase Example:  '"A"'
 *
 * Given a string columnTitle that represents the column title as appears in an
 * Excel sheet, return its corresponding column number.
 * 
 * For example:
 * 
 * 
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28 
 * ...
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: columnTitle = "A"
 * Output: 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: columnTitle = "AB"
 * Output: 28
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: columnTitle = "ZY"
 * Output: 701
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 * 
 * 
 */

// @lc code=start
class Solution {
    public int titleToNumber(String n) {
        int ans=0;
        
        for(int i=0;i<n.length();i++){
            int a=(int)(n.charAt(i)-'A') + 1 ;
            ans=ans*26+a;
        }
        
        return ans;
    }
}
// @lc code=end

