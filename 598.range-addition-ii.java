/*
 * @lc app=leetcode id=598 lang=java
 *
 * [598] Range Addition II
 *
 * https://leetcode.com/problems/range-addition-ii/description/
 *
 * algorithms
 * Easy (55.24%)
 * Likes:    799
 * Dislikes: 889
 * Total Accepted:    87.2K
 * Total Submissions: 157.8K
 * Testcase Example:  '3\n3\n[[2,2],[3,3]]'
 *
 * You are given an m x n matrix M initialized with all 0's and an array of
 * operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented
 * by one for all 0 <= x < ai and 0 <= y < bi.
 * 
 * Count and return the number of maximum integers in the matrix after
 * performing all the operations.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: m = 3, n = 3, ops = [[2,2],[3,3]]
 * Output: 4
 * Explanation: The maximum integer in M is 2, and there are four of it in M.
 * So return 4.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: m = 3, n = 3, ops =
 * [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3]]
 * Output: 4
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: m = 3, n = 3, ops = []
 * Output: 9
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= m, n <= 4 * 10^4
 * 0 <= ops.length <= 10^4
 * ops[i].length == 2
 * 1 <= ai <= m
 * 1 <= bi <= n
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops==null || ops.length==0)return m*n;
        
        int rmax=ops[0][0];
        int cmax=ops[0][1];
         for(int i=1;i<ops.length;i++){
             rmax=Math.min(rmax,ops[i][0]);
             cmax=Math.min(cmax,ops[i][1]);
         }
        
        return rmax*cmax;
    }
}
// @lc code=end

