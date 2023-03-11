/*
 * @lc app=leetcode id=1592 lang=java
 *
 * [1592] Rearrange Spaces Between Words
 *
 * https://leetcode.com/problems/rearrange-spaces-between-words/description/
 *
 * algorithms
 * Easy (43.59%)
 * Likes:    361
 * Dislikes: 301
 * Total Accepted:    46.7K
 * Total Submissions: 107.3K
 * Testcase Example:  '"  this   is  a sentence "'
 *
 * You are given a string text of words that are placed among some number of
 * spaces. Each word consists of one or more lowercase English letters and are
 * separated by at least one space. It's guaranteed that text contains at least
 * one word.
 * 
 * Rearrange the spaces so that there is an equal number of spaces between
 * every pair of adjacent words and that number is maximized. If you cannot
 * redistribute all the spaces equally, place the extra spaces at the end,
 * meaning the returned string should be the same length as text.
 * 
 * Return the string after rearranging the spaces.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: text = "  this   is  a sentence "
 * Output: "this   is   a   sentence"
 * Explanation: There are a total of 9 spaces and 4 words. We can evenly divide
 * the 9 spaces between the words: 9 / (4-1) = 3 spaces.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: text = " practice   makes   perfect"
 * Output: "practice   makes   perfect "
 * Explanation: There are a total of 7 spaces and 3 words. 7 / (3-1) = 3 spaces
 * plus 1 extra space. We place this extra space at the end of the string.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= text.length <= 100
 * text consists of lowercase English letters and ' '.
 * text contains at least one word.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String reorderSpaces(String text) {
        int sp=0;
        for(char c:text.toCharArray()){
            if(c==' ')sp++;
        }
        String[] w=text.trim().split("[ ]+");
        
        if(w.length==1){
            StringBuilder ans=new StringBuilder(w[0]);
            for(int i=0;i<sp;i++)ans.append(" ");
            
            return ans.toString();
        }else{
            int div=sp/(w.length-1);
            int rem=sp-div*div;
            StringBuilder ans=new StringBuilder();
            for(String s:w){
                ans.append(s);
                for(int i=0;i<div && sp>0;i++){
                    ans.append(" ");
                    sp--;
                }
            }
            
            for(int i=0;i<rem && sp>0;i++){
                ans.append(" ");
                sp--;
            }
            
            return ans.toString();
        }
    }
}
// @lc code=end

