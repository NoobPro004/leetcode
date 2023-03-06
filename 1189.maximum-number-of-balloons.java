/*
 * @lc app=leetcode id=1189 lang=java
 *
 * [1189] Maximum Number of Balloons
 *
 * https://leetcode.com/problems/maximum-number-of-balloons/description/
 *
 * algorithms
 * Easy (61.31%)
 * Likes:    1362
 * Dislikes: 79
 * Total Accepted:    140.5K
 * Total Submissions: 229.6K
 * Testcase Example:  '"nlaebolko"'
 *
 * Given a string text, you want to use the characters of text to form as many
 * instances of the word "balloon" as possible.
 * 
 * You can use each character in text at most once. Return the maximum number
 * of instances that can be formed.
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * 
 * Input: text = "nlaebolko"
 * Output: 1
 * 
 * 
 * Example 2:
 * 
 * 
 * 
 * 
 * Input: text = "loonbalxballpoon"
 * Output: 2
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: text = "leetcode"
 * Output: 0
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= text.length <= 10^4
 * text consists of lower case English letters only.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr=new int[26];
        for(char c:text.toCharArray())arr[c-'a']++;
        
        int max=Integer.MAX_VALUE;
        max=Math.min(arr[0],Math.min(arr[1],Math.min(arr['l'-'a']/2,Math.min(arr['o'-'a']/2,arr['n'-'a']))));
        
        return max;
    }
}
// @lc code=end

