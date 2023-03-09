/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 *
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 *
 * algorithms
 * Medium (38.01%)
 * Likes:    2852
 * Dislikes: 138
 * Total Accepted:    1.6M
 * Total Submissions: 4.2M
 * Testcase Example:  '"sadbutsad"\n"sad"'
 *
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of
 * haystack.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= haystack.length, needle.length <= 10^4
 * haystack and needle consist of only lowercase English characters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0 && needle.length()==0)return 0;
        if(haystack.length()==0)return -1;
        if(needle.length()==0)return 0;
        
        int[] lps =getLps(needle);
        int i=0;
        int j=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
                if(j==needle.length())return i-needle.length()+1;
                
                i++;
            }else{
                if(j>0)j=lps[j-1];
                else i++;
            }
        }
        
        return -1;
    }
    
    public int[] getLps(String s){
        int[] lps= new int[s.length()];
        int i=1;
        int len=0;
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

