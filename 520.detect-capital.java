/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 *
 * https://leetcode.com/problems/detect-capital/description/
 *
 * algorithms
 * Easy (57.09%)
 * Likes:    3136
 * Dislikes: 443
 * Total Accepted:    384K
 * Total Submissions: 673.3K
 * Testcase Example:  '"USA"'
 *
 * We define the usage of capitals in a word to be right when one of the
 * following cases holds:
 * 
 * 
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * 
 * 
 * Given a string word, return true if the usage of capitals in it is right.
 * 
 * 
 * Example 1:
 * Input: word = "USA"
 * Output: true
 * Example 2:
 * Input: word = "FlaG"
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= word.length <= 100
 * word consists of lowercase and uppercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1)return true;
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for(int i=2;i<word.length();i++){
                if(!Character.isUpperCase(word.charAt(i)))return false;
            }
        }else{
            for(int i=1;i<word.length();i++)if(Character.isUpperCase(word.charAt(i)))return false;
        }
        
        return true;
    }
}
// @lc code=end

