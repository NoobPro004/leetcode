/*
 * @lc app=leetcode id=2108 lang=java
 *
 * [2108] Find First Palindromic String in the Array
 *
 * https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
 *
 * algorithms
 * Easy (78.74%)
 * Likes:    749
 * Dislikes: 26
 * Total Accepted:    79.3K
 * Total Submissions: 100.8K
 * Testcase Example:  '["abc","car","ada","racecar","cool"]'
 *
 * Given an array of strings words, return the first palindromic string in the
 * array. If there is no such string, return an empty string "".
 * 
 * A string is palindromic if it reads the same forward and backward.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: words = ["abc","car","ada","racecar","cool"]
 * Output: "ada"
 * Explanation: The first string that is palindromic is "ada".
 * Note that "racecar" is also palindromic, but it is not the first.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: words = ["notapalindrome","racecar"]
 * Output: "racecar"
 * Explanation: The first and only string that is palindromic is "racecar".
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: words = ["def","ghi"]
 * Output: ""
 * Explanation: There are no palindromic strings, so the empty string is
 * returned.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 100
 * words[i] consists only of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(isPalin(s))return s;
        }
        
        return "";
    }
    
    public boolean isPalin(String s){
        int l=0;
        int h=s.length()-1;
        while(l<=h){
            if(s.charAt(l)!=s.charAt(h))return false;
            
            l++;
            h--;
        }
        
        return true;
    }
}
// @lc code=end

