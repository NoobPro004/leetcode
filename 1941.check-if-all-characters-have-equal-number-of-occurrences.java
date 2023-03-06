/*
 * @lc app=leetcode id=1941 lang=java
 *
 * [1941] Check if All Characters Have Equal Number of Occurrences
 *
 * https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/
 *
 * algorithms
 * Easy (76.84%)
 * Likes:    624
 * Dislikes: 14
 * Total Accepted:    58.6K
 * Total Submissions: 76.3K
 * Testcase Example:  '"abacbc"'
 *
 * Given a string s, return true if s is a good string, or false otherwise.
 * 
 * A string s is good if all the characters that appear in s have the same
 * number of occurrences (i.e., the same frequency).
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "abacbc"
 * Output: true
 * Explanation: The characters that appear in s are 'a', 'b', and 'c'. All
 * characters occur 2 times in s.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "aaabb"
 * Output: false
 * Explanation: The characters that appear in s are 'a' and 'b'.
 * 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of
 * times.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 1000
 * s consists of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr=new int[26];
        for(char c:s.toCharArray())arr[c-'a']++;
        
        int count=-1;
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                if(count==-1)count=arr[i];
                else if(count!=arr[i])return false;
            }
        }
        
        return true;
    }
}
// @lc code=end

