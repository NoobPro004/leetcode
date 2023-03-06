/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 *
 * https://leetcode.com/problems/find-the-difference/description/
 *
 * algorithms
 * Easy (60.11%)
 * Likes:    3659
 * Dislikes: 416
 * Total Accepted:    479.9K
 * Total Submissions: 799.5K
 * Testcase Example:  '"abcd"\n"abcde"'
 *
 * You are given two strings s and t.
 * 
 * String t is generated by random shuffling string s and then add one more
 * letter at a random position.
 * 
 * Return the letter that was added to t.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "abcd", t = "abcde"
 * Output: "e"
 * Explanation: 'e' is the letter that was added.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "", t = "y"
 * Output: "y"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s and t consist of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        int[] count=new int[26];
        for(char c:s.toCharArray())count[c-'a']++;
        
        for(char c:t.toCharArray())count[c-'a']--;
        
        for(int i=0;i<26;i++)if(count[i]==-1)return (char)(i+'a');
        
        throw null;
    }
}
// @lc code=end
