/*
 * @lc app=leetcode id=999 lang=java
 *
 * [999] Available Captures for Rook
 *
 * https://leetcode.com/problems/available-captures-for-rook/description/
 *
 * algorithms
 * Easy (68.03%)
 * Likes:    548
 * Dislikes: 606
 * Total Accepted:    56.5K
 * Total Submissions: 83K
 * Testcase Example:  '[[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]'
 *
 * On an 8 x 8 chessboard, there is exactly one white rook 'R' and some number
 * of white bishops 'B', black pawns 'p', and empty squares '.'.
 * 
 * When the rook moves, it chooses one of four cardinal directions (north,
 * east, south, or west), then moves in that direction until it chooses to
 * stop, reaches the edge of the board, captures a black pawn, or is blocked by
 * a white bishop. A rook is considered attacking a pawn if the rook can
 * capture the pawn on the rook's turn. The number of available captures for
 * the white rook is the number of pawns that the rook is attacking.
 * 
 * Return the number of available captures for the white rook.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: board =
 * [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
 * Output: 3
 * Explanation: In this example, the rook is attacking all the pawns.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: board =
 * [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
 * Output: 0
 * Explanation: The bishops are blocking the rook from attacking any of the
 * pawns.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: board =
 * [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
 * Output: 3
 * Explanation: The rook is attacking the pawns at positions b5, d6, and
 * f5.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * board.length == 8
 * board[i].length == 8
 * board[i][j] is either 'R', '.', 'B', or 'p'
 * There is exactly one cell with board[i][j] == 'R'
 * 
 * 
 */

// @lc code=start
class Solution {
    public int numRookCaptures(char[][] board) {
        int r=-1;
        int ans=0;
        int c=-1;
         for(int i=0;i<board.length;i++){
             boolean found=false;
             for(int j=0;j<board[0].length;j++){
                 if(board[i][j]=='R'){
                     found=true;
                     r=i;
                     c=j;
                     break;
                 }
             }
             if(found)break;
         }
        
        if(r==-1 || c==-1)return 0;
        
        for(int i=r;i>=0;i--){
            char ch=board[i][c];
            if(ch=='p'){
                ans++;
                break;
            }
            else if(ch=='B')break;
        }
        
        for(int i=r;i<board.length;i++){
            char ch=board[i][c];
            if(ch=='p'){
                ans++;
                break;
            }
            else if(ch=='B')break;
        }
        
        for(int i=c;i>=0;i--){
            char ch=board[r][i];
            if(ch=='p'){
                ans++;
                break;
            }
            else if(ch=='B')break;
        }
        
        for(int i=c;i<board[0].length;i++){
            char ch=board[r][i];
            if(ch=='p'){
                ans++;
                break;
            }
            else if(ch=='B')break;
            
        }
        
        return ans;
    }
}
// @lc code=end

