/*
 * @lc app=leetcode id=463 lang=java
 *
 * [463] Island Perimeter
 *
 * https://leetcode.com/problems/island-perimeter/description/
 *
 * algorithms
 * Easy (69.65%)
 * Likes:    5401
 * Dislikes: 265
 * Total Accepted:    421.3K
 * Total Submissions: 604.8K
 * Testcase Example:  '[[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]'
 *
 * You are given row x col grid representing a map where grid[i][j] = 1
 * represents land and grid[i][j] = 0 represents water.
 * 
 * Grid cells are connected horizontally/vertically (not diagonally). The grid
 * is completely surrounded by water, and there is exactly one island (i.e.,
 * one or more connected land cells).
 * 
 * The island doesn't have "lakes", meaning the water inside isn't connected to
 * the water around the island. One cell is a square with side length 1. The
 * grid is rectangular, width and height don't exceed 100. Determine the
 * perimeter of the island.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
 * Output: 16
 * Explanation: The perimeter is the 16 yellow stripes in the image above.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: grid = [[1]]
 * Output: 4
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: grid = [[1,0]]
 * Output: 4
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * row == grid.length
 * col == grid[i].length
 * 1 <= row, col <= 100
 * grid[i][j] is 0 or 1.
 * There is exactly one island in grid.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){ans+=4;
                if(i>0 && grid[i-1][j]==1){
                    ans-=2;
                }
                if(j>0 && grid[i][j-1]==1)ans-=2;}
            }
        }
        
        return ans;
    }
}
// @lc code=end

