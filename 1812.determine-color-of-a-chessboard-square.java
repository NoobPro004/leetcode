/*
 * @lc app=leetcode id=1812 lang=java
 *
 * [1812] Determine Color of a Chessboard Square
 *
 * https://leetcode.com/problems/determine-color-of-a-chessboard-square/description/
 *
 * algorithms
 * Easy (77.64%)
 * Likes:    618
 * Dislikes: 15
 * Total Accepted:    54.8K
 * Total Submissions: 70.7K
 * Testcase Example:  '"a1"'
 *
 * You are given coordinates, a string that represents the coordinates of a
 * square of the chessboard. Below is a chessboard for your reference.
 * 
 * 
 * 
 * Return true if the square is white, and false if the square is black.
 * 
 * The coordinate will always represent a valid chessboard square. The
 * coordinate will always have the letter first, and the number second.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: coordinates = "a1"
 * Output: false
 * Explanation: From the chessboard above, the square with coordinates "a1" is
 * black, so return false.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: coordinates = "h3"
 * Output: true
 * Explanation: From the chessboard above, the square with coordinates "h3" is
 * white, so return true.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: coordinates = "c7"
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * coordinates.length == 2
 * 'a' <= coordinates[0] <= 'h'
 * '1' <= coordinates[1] <= '8'
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a=coordinates.charAt(0)-'a';
        int b=coordinates.charAt(1)-'0';
        if(a%2==0){
            return b%2==0; 
        }else{
            return b%2!=0;
        }
    }
}
// @lc code=end

