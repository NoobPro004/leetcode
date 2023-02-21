/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 *
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 *
 * algorithms
 * Easy (60.40%)
 * Likes:    3559
 * Dislikes: 294
 * Total Accepted:    648.3K
 * Total Submissions: 1.1M
 * Testcase Example:  '3'
 *
 * Given an integer rowIndex, return the rowIndex^th (0-indexed) row of the
 * Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it as shown:
 * 
 * 
 * Example 1:
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 * Example 2:
 * Input: rowIndex = 0
 * Output: [1]
 * Example 3:
 * Input: rowIndex = 1
 * Output: [1,1]
 * 
 * 
 * Constraints:
 * 
 * 
 * 0 <= rowIndex <= 33
 * 
 * 
 * 
 * Follow up: Could you optimize your algorithm to use only O(rowIndex) extra
 * space?
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        
        ans.add(1);
        if(rowIndex==0)return ans;
        for(int i=1;i<=rowIndex;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add(ans.get(j-1)+ans.get(j));
            }
            temp.add(1);
            ans=temp;
        }
        
        return ans;
    }
}
// @lc code=end

