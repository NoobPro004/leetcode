/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 *
 * https://leetcode.com/problems/merge-strings-alternately/description/
 *
 * algorithms
 * Easy (76.98%)
 * Likes:    946
 * Dislikes: 17
 * Total Accepted:    94.4K
 * Total Submissions: 122.3K
 * Testcase Example:  '"abc"\n"pqr"'
 *
 * You are given two strings word1 and word2. Merge the strings by adding
 * letters in alternating order, starting with word1. If a string is longer
 * than the other, append the additional letters onto the end of the merged
 * string.
 * 
 * Return the merged string.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b 
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q 
 * merged: a p b q c   d
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= word1.length, word2.length <= 100
 * word1 and word2 consist of lowercase English letters.
 * 
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            if(i<=j){
                ans.append(word1.charAt(i++)+"");
            }else{
                ans.append(word2.charAt(j++)+"");
            }
        }
        
        if(i<word1.length())ans.append(word1.substring(i));
        if(j<word2.length())ans.append(word2.substring(j));
        
        return ans.toString();
    }
}
// @lc code=end

