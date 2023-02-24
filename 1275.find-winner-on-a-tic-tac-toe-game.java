/*
 * @lc app=leetcode id=1275 lang=java
 *
 * [1275] Find Winner on a Tic Tac Toe Game
 *
 * https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/description/
 *
 * algorithms
 * Easy (54.25%)
 * Likes:    1185
 * Dislikes: 292
 * Total Accepted:    98.8K
 * Total Submissions: 182.2K
 * Testcase Example:  '[[0,0],[2,0],[1,1],[2,1],[2,2]]'
 *
 * Tic-tac-toe is played by two players A and B on a 3 x 3 grid. The rules of
 * Tic-Tac-Toe are:
 * 
 * 
 * Players take turns placing characters into empty squares ' '.
 * The first player A always places 'X' characters, while the second player B
 * always places 'O' characters.
 * 'X' and 'O' characters are always placed into empty squares, never on filled
 * ones.
 * The game ends when there are three of the same (non-empty) character filling
 * any row, column, or diagonal.
 * The game also ends if all squares are non-empty.
 * No more moves can be played if the game is over.
 * 
 * 
 * Given a 2D integer array moves where moves[i] = [rowi, coli] indicates that
 * the i^th move will be played on grid[rowi][coli]. return the winner of the
 * game if it exists (A or B). In case the game ends in a draw return "Draw".
 * If there are still movements to play return "Pending".
 * 
 * You can assume that moves is valid (i.e., it follows the rules of
 * Tic-Tac-Toe), the grid is initially empty, and A will play first.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
 * Output: "A"
 * Explanation: A wins, they always play first.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
 * Output: "B"
 * Explanation: B wins.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
 * Output: "Draw"
 * Explanation: The game ends in a draw since there are no moves to make.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= moves.length <= 9
 * moves[i].length == 2
 * 0 <= rowi, coli <= 2
 * There are no repeated elements on moves.
 * moves follow the rules of tic tac toe.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String tictactoe(int[][] moves) {
        int[] r=new int[3];
        int[] c=new int[3];
        int dig=0;
        int odig=0;
        
        for(int i=0;i<moves.length;i++){
            if(i%2==0){
                r[moves[i][0]]++;
                c[moves[i][1]]++;
                if(moves[i][0]==moves[i][1]){
                    dig++;
                    if(moves[i][0]==1)odig++;
                }else if(moves[i][0]+moves[i][1]==2){
                    odig++;
                }
            }else{
                r[moves[i][0]]--;
                c[moves[i][1]]--;
                if(moves[i][0]==moves[i][1]){
                    dig--;
                    if(moves[i][0]==1)odig--;
                }else if(moves[i][0]+moves[i][1]==2){
                    odig--;
                }
            }
        }

        
        if(r[0]==3 || r[1]==3 || r[2]==3 || c[0]==3 || c[1] ==3 || c[2]==3 || dig==3 || odig==3)return "A";
        
        if(r[0]==-3 || r[1]==-3 || r[2]==-3 || c[0]==-3 || c[1] ==-3 || c[2]==-3 || dig==-3 || odig==-3)return "B";
        
        if(moves.length==9)return "Draw";
        
        return "Pending";
    }
}
// @lc code=end

