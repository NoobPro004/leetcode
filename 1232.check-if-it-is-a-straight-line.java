/*
 * @lc app=leetcode id=1232 lang=java
 *
 * [1232] Check If It Is a Straight Line
 *
 * https://leetcode.com/problems/check-if-it-is-a-straight-line/description/
 *
 * algorithms
 * Easy (40.59%)
 * Likes:    1248
 * Dislikes: 178
 * Total Accepted:    144.2K
 * Total Submissions: 356K
 * Testcase Example:  '[[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]'
 *
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y]
 * represents the coordinate of a point. Check if these points make a straight
 * line in the XY plane.
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * 
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * 
 * 
 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= coordinates.length <= 1000
 * coordinates[i].length == 2
 * -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4
 * coordinates contains no duplicate point.
 * 
 */

// @lc code=start
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dy = c[1][1]-c[0][1];
        int dx = c[1][0]-c[0][0];
        for(int i=2;i<c.length;i++){
            int ndx=c[i][0]-c[i-1][0];
            int ndy = c[i][1]-c[i-1][1];
            if(dy*ndx !=  ndy*dx)return false;
        }
        
        return true;
    }
}
// @lc code=end

