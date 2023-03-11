/*
 * @lc app=leetcode id=1556 lang=java
 *
 * [1556] Thousand Separator
 *
 * https://leetcode.com/problems/thousand-separator/description/
 *
 * algorithms
 * Easy (54.63%)
 * Likes:    409
 * Dislikes: 23
 * Total Accepted:    40.9K
 * Total Submissions: 75K
 * Testcase Example:  '987'
 *
 * Given an integer n, add a dot (".") as the thousands separator and return it
 * in string format.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 987
 * Output: "987"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 1234
 * Output: "1.234"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 0 <= n <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public String thousandSeparator(int n) {
        StringBuilder ans=new StringBuilder(Integer.toString(n));
        if(ans.length()<=3)return ans.toString();
        int neg=3;
        int len=ans.length();
        while(len-neg>=1){
            ans.insert(len-neg,'.');
            neg+=3;
        }
        
        
        return ans.toString();
    }
}
// @lc code=end

