/*
 * @lc app=leetcode id=2373 lang=java
 *
 * [2373] Largest Local Values in a Matrix
 *
 * https://leetcode.com/problems/largest-local-values-in-a-matrix/description/
 *
 * algorithms
 * Easy (83.55%)
 * Likes:    486
 * Dislikes: 47
 * Total Accepted:    33.4K
 * Total Submissions: 40K
 * Testcase Example:  '[[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]'
 *
 * You are given an n x n integer matrix grid.
 * 
 * Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such
 * that:
 * 
 * 
 * maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid
 * centered around row i + 1 and column j + 1.
 * 
 * 
 * In other words, we want to find the largest value in every contiguous 3 x 3
 * matrix in grid.
 * 
 * Return the generated matrix.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
 * Output: [[9,9],[8,6]]
 * Explanation: The diagram above shows the original matrix and the generated
 * matrix.
 * Notice that each value in the generated matrix corresponds to the largest
 * value of a contiguous 3 x 3 matrix in grid.
 * 
 * Example 2:
 * 
 * 
 * Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
 * Output: [[2,2,2],[2,2,2],[2,2,2]]
 * Explanation: Notice that the 2 is contained within every contiguous 3 x 3
 * matrix in grid.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * n == grid.length == grid[i].length
 * 3 <= n <= 100
 * 1 <= grid[i][j] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] ans=new int[n-2][n-2];
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                int max=grid[i][j];
                for(int k=-1;k<2;k++){
                    for(int l=-1;l<2;l++){
                        max=Math.max(grid[i+k][j+l],max);
                    }
                }
                
                ans[i-1][j-1]=max;
            }
        }
        
        return ans;
    }
}
// @lc code=end

