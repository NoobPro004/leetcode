/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 *
 * https://leetcode.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (70.27%)
 * Likes:    9269
 * Dislikes: 304
 * Total Accepted:    1.1M
 * Total Submissions: 1.6M
 * Testcase Example:  '5'
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it as shown:
 * 
 * 
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= numRows <= 30
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> arr=new ArrayList<>();
            arr.add(1);
            for(int j=1;j<i;j++){
                arr.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            if(i>=1)arr.add(1);
            ans.add(arr);
        }
        
        return ans;
    }
}
// @lc code=end

