/*
 * @lc app=leetcode id=1037 lang=java
 *
 * [1037] Valid Boomerang
 *
 * https://leetcode.com/problems/valid-boomerang/description/
 *
 * algorithms
 * Easy (37.21%)
 * Likes:    317
 * Dislikes: 447
 * Total Accepted:    39.8K
 * Total Submissions: 107.1K
 * Testcase Example:  '[[1,1],[2,3],[3,2]]'
 *
 * Given an array points where points[i] = [xi, yi] represents a point on the
 * X-Y plane, return true if these points are a boomerang.
 * 
 * A boomerang is a set of three points that are all distinct and not in a
 * straight line.
 * 
 * 
 * Example 1:
 * Input: points = [[1,1],[2,3],[3,2]]
 * Output: true
 * Example 2:
 * Input: points = [[1,1],[2,2],[3,3]]
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 
 * points.length == 3
 * points[i].length == 2
 * 0 <= xi, yi <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isBoomerang(int[][] points) {
        return (p[1][1]-p[0][1])*(p[2][0]-p[1][0])!=(p[1][0]-p[0][0])*(p[2][1]-p[1][1]);
    }
}
// @lc code=end

