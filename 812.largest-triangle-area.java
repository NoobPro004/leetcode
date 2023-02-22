/*
 * @lc app=leetcode id=812 lang=java
 *
 * [812] Largest Triangle Area
 *
 * https://leetcode.com/problems/largest-triangle-area/description/
 *
 * algorithms
 * Easy (60.03%)
 * Likes:    457
 * Dislikes: 1493
 * Total Accepted:    39.9K
 * Total Submissions: 66.5K
 * Testcase Example:  '[[0,0],[0,1],[1,0],[0,2],[2,0]]'
 *
 * Given an array of points on the X-Y plane points where points[i] = [xi, yi],
 * return the area of the largest triangle that can be formed by any three
 * different points. Answers within 10^-5 of the actual answer will be
 * accepted.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
 * Output: 2.00000
 * Explanation: The five points are shown in the above figure. The red triangle
 * is the largest.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: points = [[1,0],[0,0],[0,1]]
 * Output: 0.50000
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 3 <= points.length <= 50
 * -50 <= xi, yi <= 50
 * All the given points are unique.
 * 
 * 
 */

// @lc code=start
class Solution {
    public double largestTriangleArea(int[][] points) {
        double max=0;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                for(int k=j+1;k<points.length;k++){
                    max=Math.max(max,area(points[i],points[j],points[k]));
                }
            }
        }
        
        return max;
    }
    
    public double area(int[] a,int[] b,int[] c){
        return 0.5*(Math.abs(a[0]*(b[1]-c[1])+b[0]*(c[1]-a[1])+c[0]*(a[1]-b[1])));
    }
    }
}
// @lc code=end

