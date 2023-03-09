/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (40.79%)
 * Likes:    12927
 * Dislikes: 3796
 * Total Accepted:    2.2M
 * Total Submissions: 5.5M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        String pre=strs[0];
        for(String s:strs){
            pre=getPrefix(pre,s);
        }
        
        return pre;
    }
    
    public String getPrefix(String pre,String s){
        if(pre.length()==0)return pre;
        
        StringBuilder a=new StringBuilder("");
        for(int i=0;i<Math.min(pre.length(),s.length());i++){
            if(pre.charAt(i)!=s.charAt(i))return a.toString();
            
            a.append(s.charAt(i));
        }
        
        return a.toString();2
    }
}
// @lc code=end

