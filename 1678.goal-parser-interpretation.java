/*
 * @lc app=leetcode id=1678 lang=java
 *
 * [1678] Goal Parser Interpretation
 *
 * https://leetcode.com/problems/goal-parser-interpretation/description/
 *
 * algorithms
 * Easy (86.45%)
 * Likes:    1208
 * Dislikes: 81
 * Total Accepted:    171K
 * Total Submissions: 197.6K
 * Testcase Example:  '"G()(al)"'
 *
 * You own a Goal Parser that can interpret a string command. The command
 * consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal
 * Parser will interpret "G" as the string "G", "()" as the string "o", and
 * "(al)" as the string "al". The interpreted strings are then concatenated in
 * the original order.
 * 
 * Given the string command, return the Goal Parser's interpretation of
 * command.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: command = "G()(al)"
 * Output: "Goal"
 * Explanation: The Goal Parser interprets the command as follows:
 * G -> G
 * () -> o
 * (al) -> al
 * The final concatenated result is "Goal".
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: command = "G()()()()(al)"
 * Output: "Gooooal"
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: command = "(al)G(al)()()G"
 * Output: "alGalooG"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= command.length <= 100
 * command consists of "G", "()", and/or "(al)" in some order.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String interpret(String command) {
        int i=0;
        StringBuilder ans=new StringBuilder();
        while(i<command.length()){
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    ans.append("o");
                    i+=2;
                }else{
                    ans.append("al");
                    i+=4;
                }
            }else{
                ans.append("G");
                i++;
            }
        }
        
        return ans.toString();
    }
}
// @lc code=end

