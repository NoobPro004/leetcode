/*
 * @lc app=leetcode id=1380 lang=java
 *
 * [1380] Lucky Numbers in a Matrix
 *
 * https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
 *
 * algorithms
 * Easy (70.59%)
 * Likes:    1345
 * Dislikes: 74
 * Total Accepted:    80.2K
 * Total Submissions: 113.7K
 * Testcase Example:  '[[3,7,8],[9,11,13],[15,16,17]]'
 *
 * Given an m x n matrix of distinct numbers, return all lucky numbers in the
 * matrix in any order.
 * 
 * A lucky number is an element of the matrix such that it is the minimum
 * element in its row and maximum in its column.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * Output: [15]
 * Explanation: 15 is the only lucky number since it is the minimum in its row
 * and the maximum in its column.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * Output: [12]
 * Explanation: 12 is the only lucky number since it is the minimum in its row
 * and the maximum in its column.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: matrix = [[7,8],[1,2]]
 * Output: [7]
 * Explanation: 7 is the only lucky number since it is the minimum in its row
 * and the maximum in its column.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * m == mat.length
 * n == mat[i].length
 * 1 <= n, m <= 50
 * 1 <= matrix[i][j] <= 10^5.
 * All elements in the matrix are distinct.
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] r= new int[matrix.length];
        int[] c = new int[matrix[0].length];
        Arrays.fill(r,Integer.MAX_VALUE);
        Arrays.fill(c,Integer.MIN_VALUE);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                r[i]=Math.min(r[i],matrix[i][j]);
                c[j]=Math.max(c[j],matrix[i][j]);
            }
        }
        
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(r[i]==c[j])ans.add(r[i]);
            }
        }
        return ans;`
    }
}
// @lc code=end

