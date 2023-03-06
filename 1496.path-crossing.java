/*
 * @lc app=leetcode id=1496 lang=java
 *
 * [1496] Path Crossing
 *
 * https://leetcode.com/problems/path-crossing/description/
 *
 * algorithms
 * Easy (56.00%)
 * Likes:    609
 * Dislikes: 14
 * Total Accepted:    44.1K
 * Total Submissions: 78.8K
 * Testcase Example:  '"NES"'
 *
 * Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing
 * moving one unit north, south, east, or west, respectively. You start at the
 * origin (0, 0) on a 2D plane and walk on the path specified by path.
 * 
 * Return true if the path crosses itself at any point, that is, if at any time
 * you are on a location you have previously visited. Return false
 * otherwise.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: path = "NES"
 * Output: false 
 * Explanation: Notice that the path doesn't cross any point more than once.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: path = "NESWW"
 * Output: true
 * Explanation: Notice that the path visits the origin twice.
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= path.length <= 10^4
 * path[i] is either 'N', 'S', 'E', or 'W'.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        Set<String> set = new HashSet<>();
        set.add(x+","+y);
        for(char c : path.toCharArray()){
            if(c=='N'){
                y+=1;
            }else if(c=='S'){
                y-=1;
            }else if(c=='E'){
                x+=1;
            }else{
                x-=1;
            }
            
            if(set.contains(x+","+y))return true;
            
            set.add(x+","+y);
        }
        
        return false;
    }
}
// @lc code=end

