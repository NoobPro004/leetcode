/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 *
 * https://leetcode.com/problems/repeated-substring-pattern/description/
 *
 * algorithms
 * Easy (43.71%)
 * Likes:    4224
 * Dislikes: 378
 * Total Accepted:    287.6K
 * Total Submissions: 657.7K
 * Testcase Example:  '"abab"'
 *
 * Given a string s, check if it can be constructed by taking a substring of it
 * and appending multiple copies of the substring together.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "aba"
 * Output: false
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc"
 * twice.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 10^4
 * s consists of lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int[] lps = getLps(s);
        if(lps[s.length()-1]==0)return false;
        int len=s.length()-lps[s.length()-1];
        return len>0 && s.length()%len==0;
        
    }
    
    public int[] getLps(String s){
        int[] lps=new int[s.length()];
        int len=0;
        int i=1;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0)len=lps[len-1];
                else i++;
            }
        }
        
        return lps;
    }
}
// @lc code=end

