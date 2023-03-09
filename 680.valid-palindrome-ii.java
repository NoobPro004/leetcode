/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 *
 * https://leetcode.com/problems/valid-palindrome-ii/description/
 *
 * algorithms
 * Easy (39.30%)
 * Likes:    6931
 * Dislikes: 360
 * Total Accepted:    580.9K
 * Total Submissions: 1.5M
 * Testcase Example:  '"aba"'
 *
 * Given a string s, return true if the s can be palindrome after deleting at
 * most one character from it.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "aba"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "abc"
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 10^5
 * s consists of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(isPalin(s.substring(i,j)) || isPalin(s.substring(i+1,j+1)))return true;
                else return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
    
    public boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        
        return true;
    }
}
// @lc code=end

