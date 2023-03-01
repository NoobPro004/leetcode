/*
 * @lc app=leetcode id=1582 lang=java
 *
 * [1582] Special Positions in a Binary Matrix
 *
 * https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/
 *
 * algorithms
 * Easy (65.49%)
 * Likes:    592
 * Dislikes: 21
 * Total Accepted:    39.3K
 * Total Submissions: 60.1K
 * Testcase Example:  '[[1,0,0],[0,0,1],[1,0,0]]'
 *
 * Given an m x n binary matrix mat, return the number of special positions in
 * mat.
 * 
 * A position (i, j) is called special if mat[i][j] == 1 and all other elements
 * in row i and column j are 0 (rows and columns are 0-indexed).
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
 * Output: 1
 * Explanation: (1, 2) is a special position because mat[1][2] == 1 and all
 * other elements in row 1 and column 2 are 0.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
 * Output: 3
 * Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * m == mat.length
 * n == mat[i].length
 * 1 <= m, n <= 100
 * mat[i][j] is either 0 or 1.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int numSpecial(int[][] mat) {
        int[] r = new int[mat.length];
        int[] c = new int[mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                r[i]+=mat[i][j];
                c[j]+=mat[i][j];
            }
        }
        
        int ans= 0;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && r[i]==1 && c[j]==1)ans++;
            }
        }
        
        return ans;
    }
}
// @lc code=end

