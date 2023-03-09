/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 *
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *
 * algorithms
 * Easy (81.83%)
 * Likes:    4691
 * Dislikes: 221
 * Total Accepted:    665.8K
 * Total Submissions: 813.2K
 * Testcase Example:  `"Let's take LeetCode contest"`
 *
 * Given a string s, reverse the order of characters in each word within a
 * sentence while still preserving whitespace and initial word order.
 * 
 * 
 * Example 1:
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 * Input: s = "God Ding"
 * Output: "doG gniD"
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 5 * 10^4
 * s contains printable ASCII characters.
 * s does not contain any leading or trailing spaces.
 * There is at least one word in s.
 * All the words in s are separated by a single space.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        
        StringBuilder ans=new StringBuilder();
        for(String ss:arr){
            StringBuilder temp=new StringBuilder(ss);
            ans.append(temp.reverse().toString());
            ans.append(" ");
        }
        
        return ans.toString().trim();
    }
}
// @lc code=end

