/*
 * @lc app=leetcode id=766 lang=java
 *
 * [766] Toeplitz Matrix
 *
 * https://leetcode.com/problems/toeplitz-matrix/description/
 *
 * algorithms
 * Easy (68.69%)
 * Likes:    3202
 * Dislikes: 152
 * Total Accepted:    271.6K
 * Total Submissions: 395.5K
 * Testcase Example:  '[[1,2,3,4],[5,1,2,3],[9,5,1,2]]'
 *
 * Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise,
 * return false.
 * 
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the
 * same elements.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
 * Output: true
 * Explanation:
 * In the above grid, the diagonals are:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
 * In each diagonal all elements are the same, so the answer is True.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: matrix = [[1,2],[2,2]]
 * Output: false
 * Explanation:
 * The diagonal "[1, 2]" has different elements.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 20
 * 0 <= matrix[i][j] <= 99
 * 
 * 
 * 
 * Follow up:
 * 
 * 
 * What if the matrix is stored on disk, and the memory is limited such that
 * you can only load at most one row of the matrix into the memory at once?
 * What if the matrix is so large that you can only load up a partial row into
 * the memory at once?
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i>0 && j>0 && matrix[i][j]!=matrix[i-1][j-1])return false;
            }
        }
        
        return true;
    }
}
// @lc code=end

