/*
 * @lc app=leetcode id=1351 lang=java
 *
 * [1351] Count Negative Numbers in a Sorted Matrix
 *
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
 *
 * algorithms
 * Easy (75.40%)
 * Likes:    3090
 * Dislikes: 91
 * Total Accepted:    230.6K
 * Total Submissions: 305.8K
 * Testcase Example:  '[[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]'
 *
 * Given a m x n matrix grid which is sorted in non-increasing order both
 * row-wise and column-wise, return the number of negative numbers in grid.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 * Output: 8
 * Explanation: There are 8 negatives number in the matrix.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: grid = [[3,2],[1,0]]
 * Output: 0
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 100
 * -100 <= grid[i][j] <= 100
 * 
 * 
 * 
 * Follow up: Could you find an O(n + m) solution?
 */

// @lc code=start
class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        for(int[] i : grid){
            ans+=getSol(i);
        }
        
        return ans;
    }
    
    public int getSol(int[] a){
        int l=0;
        int h=a.length-1;
        int low=a.length;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]<0){
                low=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        
        return a.length-low;
    }
}
// @lc code=end

