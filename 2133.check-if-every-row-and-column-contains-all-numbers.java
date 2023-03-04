/*
 * @lc app=leetcode id=2133 lang=java
 *
 * [2133] Check if Every Row and Column Contains All Numbers
 *
 * https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/description/
 *
 * algorithms
 * Easy (52.66%)
 * Likes:    716
 * Dislikes: 42
 * Total Accepted:    50.1K
 * Total Submissions: 95.4K
 * Testcase Example:  '[[1,2,3],[3,1,2],[2,3,1]]'
 *
 * An n x n matrix is valid if every row and every column contains all the
 * integers from 1 to n (inclusive).
 * 
 * Given an n x n integer matrix matrix, return true if the matrix is valid.
 * Otherwise, return false.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
 * Output: true
 * Explanation: In this case, n = 3, and every row and column contains the
 * numbers 1, 2, and 3.
 * Hence, we return true.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
 * Output: false
 * Explanation: In this case, n = 3, but the first row and the first column do
 * not contain the numbers 2 or 3.
 * Hence, we return false.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * n == matrix.length == matrix[i].length
 * 1 <= n <= 100
 * 1 <= matrix[i][j] <= n
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0,n=matrix.length;i<n;i++){
            Set<Integer> r=new HashSet<>();
            Set<Integer> c = new HashSet<>();
             for(int j=0;j<n;j++){
                 if(!r.add(matrix[i][j]) || !c.add(matrix[j][i]))return false;
             }
        }
        
        return true;
    }
}
// @lc code=end

